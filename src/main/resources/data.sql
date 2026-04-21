INSERT INTO categorie (name) VALUES ('thriller');

INSERT INTO author (name,surname) VALUES ('Jean','Jack');

INSERT INTO books (title, description, category_id) VALUES ('Frankenstein','Victor Frankenstein tells Walton his story—a happy childhood, an unhealthy obsession with alchemy, and his engagement to his cousin Elizabeth. Victor enrolls at the University of Ingolstadt, where he discovers the secret of life and builds a creature from dead bodies.',1);

INSERT INTO books_author(author_id,book_id) VALUES (1,1);
