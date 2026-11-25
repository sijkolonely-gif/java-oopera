public class Theatre {
    public static void main(String[] args) {
        // актёры
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Сидорова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Алексей", "Козлов", Gender.MALE, 175);

        // режиссёры
        Director director1 = new Director("Сергей", "Иванов", Gender.MALE, 10);
        Director director2 = new Director("Ольга", "Смирнова", Gender.FEMALE, 5);

        // автор музыки и хореограф
        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Мариус Петипа";

        // спектакли
        Show show = new Show("Обычный спектакль", 120, director1);
        Opera opera = new Opera("Травиата", 150, director2,
                "Джузеппе Верди", "Текст либретто оперы...", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 140, director1,
                musicAuthor, "Текст либретто балета...", choreographer);

        // распределяем актёров
        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        // выводим списки актёров
        System.out.println("Актёры обычного спектакля:");
        show.printActors();

        System.out.println("Актёры оперы:");
        opera.printActors();

        System.out.println("Актёры балета:");
        ballet.printActors();

        // замена актёра в опере
        System.out.println("Замена актёра в опере:");
        opera.replaceActor(actor2, "Козлов");
        opera.printActors();

        // замена несуществующего актёра в балете
        System.out.println("Замена несуществующего актёра в балете:");
        ballet.replaceActor(actor1, "Несуществующий");

        // либретто
        System.out.println("Либретто оперы:");
        opera.printLibretto();

        System.out.println("Либретто балета:");
        ballet.printLibretto();
    }
}