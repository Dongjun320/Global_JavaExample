package GamePlays;

public class CustomCharacter extends Character {
    private String skillName;

    private CustomCharacter(Builder builder) {
        super(builder.name, builder.hp, builder.attack);
        this.skillName = builder.skillName;
    }

    @Override
    public void useSkill() {
        System.out.println("스킬: " + skillName);
    }

    public static class Builder {
        private String name;
        private int hp = 100;
        private int attack = 50;
        private String skillName = "기본 공격";

        public Builder(String name) {
            this.name = name;
        }

        public Builder hp(int hp) {
            this.hp = hp;
            return this;
        }

        public Builder attack(int attack) {
            this.attack = attack;
            return this;
        }

        public Builder skill(String skillName) {
            this.skillName = skillName;
            return this;
        }

        public CustomCharacter build() {
            return new CustomCharacter(this);
        }
    }
}
