package assignment;

public class grade {
    private final String name ;
    private final double koreanGrade ;
    private final double englishGrade ;
    private final double mathGrade ;

    public grade(String name, double koreanGrade, double englishGrade, double mathGrade){
        this.name = name ;
        this.koreanGrade = koreanGrade ;
        this.englishGrade = englishGrade ;
        this.mathGrade = mathGrade ;

        double score = ( koreanGrade + englishGrade + mathGrade ) / 3 ;

        System.out.printf("%s의 평균점수: %.2f\n", name, score);
    }
}
