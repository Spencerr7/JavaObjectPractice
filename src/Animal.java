public class Animal {
    private String type;
    private int strength;
    private int health;

    public Animal(){
        this.type = "";
        this.health = 0;
        this.strength = 1;
    }

    public Animal(String type, int strength, int health){
        setType(type);
        setStrength(strength);
        setHealth(health);
    }
    public void setType(String type){
        this.type = type;
    }

    public void setStrength(int strength){
        if(strength <= 0){
            this.strength = 1;
        }else{
            this.strength = strength;
        }
    }

    public void setHealth(int health){
        if(health < 0){
            this.health = 0;
        }else{
            this.health = health;
        }
    }

    public boolean isDead(){
        return health <= 0;
    }

    public String getType(){
        return type;
    }
    public int getStrength() {
        return strength;
    }
    public int getHealth(){
        return health;
    }

    @Override
    public String toString(){
        return "Type: " + type + "; Strength " + strength + "; Health " + health;
    }
}
