package myProject.inputOutputService;

import myProject.currencyService.Currency;
import myProject.currencyService.Mode;

public interface IPrinter
{
    String getEndString(int digit, Currency currency, Mode mode); //Конец строки - валюта. Например тычяча РУБЛЕЙ, ФУНТОВ и т.д.
}
