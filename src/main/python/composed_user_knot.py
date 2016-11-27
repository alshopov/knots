from services import UserService as USER_SERVICE
from country_knot import CountryKnot


class ComposedUserKnot(object):

    def __init__(self, user_id):
        self.user_id = user_id
        self._cached_user = None
        self._cached_country_knot = None

    @property
    def user(self):
        if self._cached_user is None:
            self._cached_user = USER_SERVICE.get_user_by_id(self.user_id)

    @property
    def _country_knot(self):
        if self._cached_country_knot is None:
            self._cached_country_knot = CountryKnot(self.user.coutry_id)
        return self._cached_country_knot

    @property
    def country(self):
        return self._country_knot.country

    @property
    def currency(self):
        return self._country_knot.currency
