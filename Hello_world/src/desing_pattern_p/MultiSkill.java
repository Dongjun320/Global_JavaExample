package desing_pattern_p;

import java.util.List;

public class MultiSkill implements Skill {
    private List<Skill> skills;
    public MultiSkill(Skill... skills) {
        this.skills = List.of(skills);
    }

    @Override
    public void use() {
        skills.forEach(Skill::use);
    }
}
