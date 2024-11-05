public enum SubjectsStudents
{
    PHILOSOPNHY ("Философия"),
    PHISICS ("Физика"),
    NETWORK ("Системы и сети"),
    COMPMATHEMATICS("Выч. математика"),
    ENGLISH ("Английский"),
    GRAPHICS("Комп. графика");

    private String title;

    SubjectsStudents(String title) {
        this.title = title;
    }

    public String getTitle() {return title;}

    @Override
    public String toString() {return title;}
}
