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
        }
    }

