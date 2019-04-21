package ru.avalon.java.j20.labs.models;

import java.awt.geom.Path2D;
import java.text.ParseException;
import java.util.Map;

/**
 * Модель представления о стране.
 */
public class Country {
    /**
     * Код страны.
     */
    private final String code;
    /**
     * Название страны.
     */
    private final String name;

    /**
     * Основное конструктор класса.
     *
     * @param code код страны
     * @param name название страны
     */
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Возвращает код страны.
     *
     * @return строковый код страны
     */
    public String getCode() {
        return code;
    }

    /**
     * Возвращает название страны.
     *
     * @return название страны
     */
    public String getName() {
        return name;
    }

    /*
     * TODO(Студент): для класса Country переопределить методы equals и hashCode
     */

    /**
     * Возвращает экземпляр страны созданный из переданного
     * текста в формате 'Код:Название'.
     *
     * @param text тектс в формате 'Код:Название'
     * @return новый экземпляр типа {@Link Country}.
     * @throws ParseException в случае, если переданная строка
     * имеет неверный формат.
     */
    
    public static Country valueOf(String text) throws ParseException {
        /*
         * TODO(Студент): Реализовать метод valueOf класса Country
         */
        String splittedText[]= new String[2];
        if (text.matches("^[A-Z]{2}[\\\\:]{1}[а-яА-Я]+$")==true) {
          splittedText = text.split("\\:", 2);
            throw new ParseException("this text cannot be used to creating Country", 2);
        } 
            return new Country(splittedText[0], splittedText[1]);
        } 
}
