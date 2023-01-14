
public class Main {
    public static void main(String[] args){
        Boss boss = new Boss(788,100, "Drago");
        System.out.println("Босс \nхорошняк пацан:");
        System.out.println("Heath:" + boss.getHeath() + "\nУрон:" + boss.getDamage() +"\nЗащита:"
                   + boss.getProtection());
    }
    public Hero createHeroes(){
        Hero Putin = new  Hero(10000,23456,"АтомнаяБомба");
        Hero joeBiden = new  Hero(13,0,"нету");
        Hero Zelenskiy = new Hero(11,3,"нету");
        Hero[] heroes = new Hero[]{Hero.Putin, joeBiden, Zelenskiy};
        return createHeroes();
    }
}
