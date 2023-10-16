package Pokemonster;

public abstract class Pokemon {
    protected int level;
    private int hp;
    protected String name;
    private static int pokemonCount = 0;

    public static int getPokemonCount() {
        return pokemonCount;
    }

    public Pokemon(int level, int hp, String name) {
        this.level = level;
        this.hp = hp;
        this.name = name;
    }
    public Pokemon() {
        pokemonCount++;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void attack(Pokemon targertPokemon) {
        System.out.println(this.name + "이(가)" + targertPokemon.name + "에게 공격 시전!");
    }

    public void evolve() {
        if (this instanceof Pickashu) {
            System.out.println("삐까~");
        } else if ( this instanceof Squirtle) {
            System.out.println("꼬북~");
        } else if ( this instanceof Charizard) {
            System.out.println("자몽~");
        }
        this.level = this.level + 1;
        this.hp = this.hp + 100;
        String texts = """
                name의 레벨이 
                level으로 증가
                """ .replace("name", this.name)
                    .replace("level", this.level + "");
        System.out.println(texts);
    }
}
