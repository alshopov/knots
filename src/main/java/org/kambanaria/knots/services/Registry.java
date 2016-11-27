package org.kambanaria.knots.services;

public class Registry {

    public static Registry getInstance() {
        return RegistryHolder.REGISTRY;
    }

    private UserService userService;
    private CountryService countryService;
    private CurrencyService currencyService;
    private AccountService accountService;
    private BankService bankService;

    public UserService getUserService() {
        return userService;
    }

    public CountryService getCountryService() {
        return countryService;
    }

    public CurrencyService getCurrencyService() {
        return currencyService;
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public BankService getBankService() {
        return bankService;
    }

    private static class RegistryHolder {

        static final Registry REGISTRY;

        static {
            REGISTRY = new Registry();
            REGISTRY.userService = null;
            REGISTRY.countryService = null;
            REGISTRY.currencyService = null;
            REGISTRY.accountService = null;
            REGISTRY.bankService = null;
        }

        private RegistryHolder() {
        }
    }
}
