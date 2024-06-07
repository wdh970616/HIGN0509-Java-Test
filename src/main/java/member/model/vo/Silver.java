package member.model.vo;

public class Silver extends Member {
    public Silver(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        return super.getPoint() * 0.02;
    }
}
