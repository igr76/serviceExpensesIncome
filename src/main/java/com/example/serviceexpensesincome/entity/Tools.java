package com.example.serviceexpensesincome.entity;

import com.example.serviceexpensesincome.dto.Type;
import com.example.serviceexpensesincome.dto.Unit;

import java.util.Date;

public class Tools {
    /** ID tool */
    int Id;
    /** Класс основного средства */
    Type type;
    /** Признак Использования */
    boolean signExpenses;
    /** Признак  в
     аренде, не в аренде */
    boolean signRent;
    /** ID здания */
    int IdBuilding;
    /** Дата начала действия связи с зданием*/
    Date beginningOfOwnershipUnion;
    /** Дата окончания действия связи с зданием */
    Date endOfOwnershipUnion;
    /** Дата ввода в эксплуатацию */
    Date beginningOfOperation;
    /** Дата выбытия*/
    Date endOfOperation;

    /** Площадь */
    int square;

    /** Единица измерения площади */
    Unit UnitOfArea;
}
