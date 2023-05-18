package myProject.inputOutputService;

import myProject.currencyService.Currency;

public interface IPrinter
{
    String getEndString(int digit, Currency currency); //Конец строки - валюта. Например тычяча РУБЛЕЙ, ФУНТОВ и т.д.
}
