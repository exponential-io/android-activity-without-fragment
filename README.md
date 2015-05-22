# README

This is a repo that new Android developers can use to learn how to navigate between Activities. This
example does not use Fragments and is therefore extremely simple to implement.


- Create a new project with a blank activity named `AActivity`.
- Edit `activity_a.xml` as follows (view the source file for the exact changes):
    - Delete the default `TextView`.
    - Change `RelativeLayout` to `LinearLayout`.
    - Add an `EditText` and `Button`.
- Edit `AActivity.java` as commented in the source code.
- Create a new blank activity named `BActivity.java`. Set the hierarchical parent to `AActivity`.
- Edit `activity_b.xml` as follows (view the source file for the exact changes):
    - Delete the default `TextView`.
    - Change `RelativeLayout` to `LinearLayout`.
    - Add a `TextView` to display the user's first name.
- Edit `BActivity.java` as commented in the source code.

## Some shortcuts to learn in Android Studio (Linux)

- `Shift + Delete`: Delete line
- `Ctrl + D`: Duplicate line
- `Alt + Enter`: Import class that the cursor is on
- `Alt + Enter`: When in a layout, create a resource enter for the item that the cursor is on
