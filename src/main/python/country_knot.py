from services import CountryService as COUNTRY_SERVICE
from services import CurrencyService as CURRENCY_SERVICE


class CountryKnot(object):

    def __init__(self, country_id):
        self.country_id = country_id
        self._cached_country = None
        self._cached_currency = None

    @property
    def country(self):
        if self._cached_country is None:
            self._cached_country = COUNTRY_SERVICE.get_country_by_id(self.country_id)
        return self._cached_country

    @property
    def currency(self):
        if self._cached_currency is None:
            self._cached_currency = CURRENCY_SERVICE.get_currency_by_id(self.coutry.currency_id)
        return self._cached_currency
