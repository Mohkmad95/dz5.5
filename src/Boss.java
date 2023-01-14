public class Boss {
    private int Heath;
    private int Damage;
    private String protection;
    public Boss(int Heath, int Damage, String protection){
        this.Heath = Heath;
        this.Damage = Damage;
        this.protection = protection;
    }
    public int getHeath(){
        return Heath;
    }
    public int getDamage(){
        return Damage;
    }
    public String getProtection(){
        return protection;
    }
}
