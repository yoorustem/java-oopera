public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Леонардо", "ДиКаприо", Gender.MALE, 150);
        Actor actor2 = new Actor("Брюс", "Уиллис", Gender.MALE, 210);
        Actor actor3 = new Actor("Саша", "Грей", Gender.FEMALE, 180);

        Director director1 = new Director("Антон", "Суп", Gender.MALE, 14);
        Director director2 = new Director("Артур", "Хлеб", Gender.MALE, 8);

        Person musicAuthor = new Person("Влад", "Шопен", Gender.MALE);
        Person choreographer = new Person("Александр", "Пистолетов", Gender.MALE);

        Show show = new Show("Шоу", 150, director1);
        Opera opera = new Opera("Опера", 100, director2, musicAuthor.name + " "+ musicAuthor.surname, "Текст либретто", 25);
        Ballet ballet =  new Ballet("Балет", 120, director1, "Пистолетов", "Еще один текст либретто", choreographer.name + " " + choreographer.surname);

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor1);
        opera.addActor(actor2);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        show.printActors();
        opera.printActors();
        ballet.printActors();

        show.replaceActor("Уиллис", actor3);
        show.printActors();

        show.replaceActor("Noname", actor1);
        opera.printLibretto();
        ballet.printLibretto();
    }
}
