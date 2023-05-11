public class App {
  public static void main(String[] args) {
      System.out.println("Nama : IKHLASUL AMAL");
      System.out.println("NIM  : 225150607111018");
      System.out.println();
      
        Hero hero = new Hero();
        hero.move();
        hero.move("Foward");

        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(5);

        Character character1 = new Hero();
        Character character2 = new Enemy();
        Character character3 = new Witch();
        Character character4 = new Fighter();

        character1.move();
        character2.move();
        character3.move();
        character4.move();

        Witch witch = new Witch();
        witch.move();
        Fighter fighter = new Fighter();
        fighter.move();
    }
}