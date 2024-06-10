package com.example.serviceexpensesincome.entity;

import com.example.serviceexpensesincome.dto.Type;

import java.util.Date;

public class Distribution {
    String company;
    /** Номер счета */
    int idScore;
    /** Позиция счета */
    int idBuilding;
    /** Год счета */
    Date accountYear;
    /** Номер позиции распределения */
    int numberPosition;
    /** Дата отражения счета в учётной системе */
    Date dateAccount;
    /** id договора */
    int idContract;
    /** ID услуги */
    int idService;
    /** Класс услуги*/
    String classService;
    /** Здание */
    String Building;
    /** Площадь */
    int square;
    /** ID основного средства */
    int Id;
    /** Класс основного средства */
    Type type;
    /** Признак Использования */
    boolean signExpenses;
    /** Распределенная сумма */
    int sizeDistribution;
    /** Счёт главной книги */
    int Score;
}
