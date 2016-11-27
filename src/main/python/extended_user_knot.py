from services import UserService as USER_SERVICE
from services import AccountService as ACCOUNT_SERVICE


class ExtendedUserKnot(object):

    def __init__(self, user_id):
        self.user_id = user_id
        self._cached_user = None
        self._cached_accounts = None

    @property
    def user(self):
        if self._cached_user is None:
            self._cached_user = USER_SERVICE.get_user_by_id(self.user_id)
        return self._cached_user

    @property
    def accounts(self):
        if self._cached_accounts is None:
            self._cached_accounts = ACCOUNT_SERVICE.get_account_by_user_id(self.user_id)
        return self._cached_accounts
