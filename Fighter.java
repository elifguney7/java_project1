public class Fighter {
    private String name;
    private int health;
    private int damage;

    public Fighter(String fighterName){
        this.name = fighterName;
        health = 100;
        damage = 10;
    }

    public Fighter(String fighterName, int fighterDamage){
        this.name = fighterName;
        this.damage = fighterDamage;
        health = 100;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
         this.name = name;
    }
    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        if(health < 0){
            this.health = 0;
        }
        else{
            this.health =health;
        }
    }

    public int getDamage(){
        return this.damage;
    }

    public void setDamage (int damage){
        if(damage < 0){
            System.out.println("Fighter's health is 0 he/she is death.");
        }
        else{
            this.damage =damage;
        }
    }

    public static int attack (Fighter fighter, Fighter enemy) {
        int health = enemy.getHealth();
        health = health - fighter.getDamage();
        enemy.setHealth(health);
        return enemy.getHealth();
    }

    public String toString(){
        return "Name: " + this.name + "\n"
                +"Health:" + this.health +"\n"
                +"Damage: " + this.damage + "\n";

    }


}
