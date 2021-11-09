package by.epam.ld.nb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NoteBook {

    private List<Note> noteBook;
    private Note note;

    public NoteBook(){
        noteBook = new ArrayList<Note>();
    }

    public void add(Note note) {
        this.note = note;
        noteBook.add(note);
    }

    public void addFew(Note ... notes) {
        for(int i = 0; i < notes.length; i++) {
            Note note = notes[i];
            noteBook.add(note);
        }
    }

    public String findByContext(String n) {
        StringBuffer buffer = new StringBuffer("");
        noteBook.forEach(note -> {
            if (note.getNote().equals(n))
                buffer.append(note.toString());
        });
        return buffer.toString();
    }


    public String findByDate(LocalDate date) {
        StringBuffer buffer = new StringBuffer("");
        noteBook.forEach(note -> {
            if (note.getDate().equals(date)) {
                buffer.append(note.toString());
            }
        });
        return buffer.toString();
    }

    @Override
    public String toString() {
        return noteBook.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        NoteBook noteBook = (NoteBook) obj;
        return this.note == noteBook.note;
    }

    @Override
    public int hashCode() {
        return noteBook.hashCode();
    }
}
