/*
Нужно написать класс Grade (оценка).
В классе должны быть 4 свойства типа int: 1) quality (качество),  2) formalization (оформление),
3) speed (скорость), 4) politness(вежливость). В конструкторе класса Grade полям quality и formalization
должны обязательно быть присвоены какие то значения, speed и politness опциональны.
Написать метод calculateGrade, который вернет среднее значение от суммы всех присутсвующих полей
(quality и formalization должны быть обязательны).
 */

public class Main {
    public static void main(String[] args) {
        Grade grade = new Grade();
        grade.readGrade();
        grade.calculateGrade();
    }
}
