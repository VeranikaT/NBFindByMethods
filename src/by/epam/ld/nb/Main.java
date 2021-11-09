package by.epam.ld.nb;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        NoteBookProvider provider = NoteBookProvider.getInstance();
        NoteBook noteBook = provider.getNoteBook();

        LocalDate date = LocalDate.now();

        Note n1 = new Note("note1", date);
        Note n2 = new Note("note2", date);
        Note n3 = new Note("note3", date);
        Note n4 = new Note("note4", date);

        noteBook.add(n1);
        noteBook.addFew(n2, n3, n4);

        System.out.println("This is the notebook's notes:\n" + noteBook.toString());

        System.out.println("This is the note № 2:\n" + noteBook.findByContext("note2"));
        System.out.println("This is the notes was made today:\n" + noteBook.findByDate(date));

    }
}
