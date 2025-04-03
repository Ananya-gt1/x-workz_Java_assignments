package com.xworkz.runner;

import com.xworkz.internal.*;

public class BookRunner {
        public static void main(String[] args) {

            Fiction fiction = new Fiction();
            fiction.read();
            fiction.summary();
            fiction.characters();
            fiction.author();
            fiction.pages();

            NonFiction nonFiction = new NonFiction();
            nonFiction.read();
            nonFiction.summary();
            nonFiction.characters();
            nonFiction.author();
            nonFiction.pages();

            Mystery mystery = new Mystery();
            mystery.read();
            mystery.summary();
            mystery.characters();
            mystery.author();
            mystery.pages();

            Biography biography = new Biography();
            biography.read();
            biography.summary();
            biography.characters();
            biography.author();
            biography.pages();

            ScienceFiction sciFi = new ScienceFiction();
            sciFi.read();
            sciFi.summary();
            sciFi.characters();
            sciFi.author();
            sciFi.pages();

            Fantasy fantasy = new Fantasy();
            fantasy.read();
            fantasy.summary();
            fantasy.characters();
            fantasy.author();
            fantasy.pages();

            Poetry poetry = new Poetry();
            poetry.read();
            poetry.summary();
            poetry.characters();
            poetry.author();
            poetry.pages();

            History history = new History();
            history.read();
            history.summary();
            history.characters();
            history.author();
            history.pages();

            Thriller thriller = new Thriller();
            thriller.read();
            thriller.summary();
            thriller.characters();
            thriller.author();
            thriller.pages();

            Romance romance = new Romance();
            romance.read();
            romance.summary();
            romance.characters();
            romance.author();
            romance.pages();

            Book book1=new Romance();
            book1.author();
            book1.read();
            book1.pages();
            book1.summary();
            book1.characters();

            Book book2 = new Mystery();
            book2.author();
            book2.read();
            book2.pages();
            book2.summary();
            book2.characters();

            Book book3 = new ScienceFiction();
            book3.author();
            book3.read();
            book3.pages();
            book3.summary();
            book3.characters();

            Book book4 = new Fantasy();
            book4.author();
            book4.read();
            book4.pages();
            book4.summary();
            book4.characters();

            Book book5 = new Fiction();
            book5.author();
            book5.read();
            book5.pages();
            book5.summary();
            book5.characters();

            Book book6 = new Thriller();
            book6.author();
            book6.read();
            book6.pages();
            book6.summary();
            book6.characters();

            Book book7 = new Poetry();
            book7.author();
            book7.read();
            book7.pages();
            book7.summary();
            book7.characters();

            Book book8 = new Biography();
            book8.author();
            book8.read();
            book8.pages();
            book8.summary();
            book8.characters();

            Book book9 = new NonFiction();
            book9.author();
            book9.read();
            book9.pages();
            book9.summary();
            book9.characters();

            Book book10 = new History();
            book10.author();
            book10.read();
            book10.pages();
            book10.summary();
            book10.characters();

        }
    }

