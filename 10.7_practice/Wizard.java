public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    int getHp() {
        return this.hp;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getMp() {
        return this.mp;
    }

    void setMp(int mp) {
        this.mp = mp;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    Wand getWand() {
        return this.wand;
    }

    void setWand(Wand wand) {
        this.wand = wand;
    }

    void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());

        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }
}
