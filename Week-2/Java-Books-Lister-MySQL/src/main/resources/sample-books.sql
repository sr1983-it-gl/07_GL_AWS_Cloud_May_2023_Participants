
DROP TABLE books;

CREATE TABLE books
(
    book_id          INTEGER PRIMARY KEY,
    author_name        TEXT NOT NULL,
    title            TEXT NOT NULL,
    publication_year INTEGER
);

INSERT INTO books (book_id, author_name, title, publication_year) VALUES (1, 'Mary Shelley', 'Frankenstein', 1818);
INSERT INTO books (book_id, author_name, title, publication_year) VALUES (2, 'Emily Brontë', 'Wuthering Heights', 1847);
INSERT INTO books (book_id, author_name, title, publication_year) VALUES (3, 'Fyodor Dostoevsky', 'Crime and Punishment', 1866);
INSERT INTO books (book_id, author_name, title, publication_year) VALUES (4, 'Henrik Ibsen', 'Peer Gynt', 1867);
INSERT INTO books (book_id, author_name, title, publication_year) VALUES (5, 'Leo Tolstoy', 'War and Peace', 1867);
INSERT INTO books (book_id, author_name, title, publication_year) VALUES (6, 'Leo Tolstoy', 'Anna Karenina', 1877);
INSERT INTO books (book_id, author_name, title, publication_year) VALUES (7, 'Henrik Ibsen', 'A Doll''s House', 1879);
INSERT INTO books (book_id, author_name, title, publication_year) VALUES (8, 'Fyodor Dostoevsky', 'The Brothers Karamazov', 1879);
INSERT INTO books (book_id, author_name, title, publication_year) VALUES (9, 'Thomas Mann', 'Buddenbrooks', 1901);
INSERT INTO books (book_id, author_name, title, publication_year) VALUES (10, 'Rabindranath Tagore', 'Gitanjali', 1910);