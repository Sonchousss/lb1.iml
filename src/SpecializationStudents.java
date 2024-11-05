public enum SpecializationStudents
{
    ISTITPK("ИСТ-ИТПК"),
    ISTISTD("ИСТ-ИСТД"),
    ISTSAPR("ИТС-САПР");

    private String title;

    SpecializationStudents(String title) {
        this.title = title;
    }

    public String getTitle() {return title;}

    @Override
    public String toString() {return title;}
}
