from services import UserService as USER_SERVICE
from services import AccountService as ACCOUNT_SERVICE
from services import BankService as BANK_SERVICE


class DoubleUserKnot(object):
    def __init__(self, user_id, bank_id):
        self.user_id = user_id
        self.bank_id = bank_id
        self._cached_user = None
        self._cached_bank = None
        self._cached_accounts = None

    @property
    def user(self):
        if self._cached_user is None:
            self._cached_user = USER_SERVICE.get_user_by_id(self.user_id)
        return self._cached_user

    @property
    def bank(self):
        if self._cached_bank is None:
            self._cached_bank = BANK_SERVICE.get_bank_by_id(self.bank_id)
        return self._cached_bank

    @property
    def accounts(self):
        if self._cached_accounts is None:
            self._cached_accounts = ACCOUNT_SERVICE.get_accounts_by_user_id_bank_id(
                self.user_id, self.bank_id)
        return self._cached_accounts
