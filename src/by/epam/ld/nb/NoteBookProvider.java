package by.epam.ld.nb;

public class NoteBookProvider {

    private static final NoteBookProvider instance = new NoteBookProvider();

    NoteBook noteBook = new NoteBook();

    private NoteBookProvider(){

    }

    public NoteBook getNoteBook(){
        return noteBook;
    }

    public static NoteBookProvider getInstance(){
        return instance;
    }

}
