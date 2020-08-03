package app.khatrisoftwares.notes.listeners;

import app.khatrisoftwares.notes.entities.Note;

public interface NotesListeners {

    void onNoteClicked(Note note,int position);
}
