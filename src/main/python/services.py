from __builtin__ import staticmethod


class UserService(object):
    @staticmethod
    def get_user_by_id(user_id):
        return None


class AccountService(object):
    @staticmethod
    def get_account_by_user_id(user_id):
        return []

    @staticmethod
    def get_account_by_id(account_id):
        return None

    @staticmethod
    def get_accounts_by_user_id_bank_id(user_id, bank_id):
        return []


class CountryService(object):
    @staticmethod
    def get_country_by_id(country_id):
        return None


class CurrencyService(object):
    @staticmethod
    def get_currency_by_id(currency_id):
        return None


class BankService(object):
    @staticmethod
    def get_bank_by_id(bank_id):
        return None
