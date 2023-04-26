package ru.gb.Homework5.view;

/*
Реализовать систему работы банковского приложения.
- Создать класс пользователь и соответсвующие классы
- Реализовать операции зачисления средств пользователю на счет и списания
(У пользователя должно быть отдельное поле - его балланс)
- Реализовать функции добавления и удаления пользователя
 */

import ru.gb.Homework5.controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер счета и имя пользователя");
        userController.saveUser(scanner.nextInt(), scanner.next());
        System.out.println("Введите номер счета и имя пользователя");
        userController.saveUser(scanner.nextInt(), scanner.next());
        System.out.println(userController.getUserList());

        System.out.println("Введите имя пользователя и сумму зачисления");
        userController.inDeposits(scanner.next(), scanner.nextDouble());
        System.out.println(userController.getUserList());
        System.out.println("Введите имя пользователя и сумму списания");
        userController.outDeposits(scanner.next(), scanner.nextDouble());
        System.out.println(userController.getUserList());

        System.out.println("Введите имя удаляемого пользователя");
        userController.removeUser(scanner.next());
        System.out.println(userController.getUserList());

        scanner.close();
    }
}
