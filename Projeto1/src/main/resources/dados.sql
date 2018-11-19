CREATE TABLE 'livro' (
  'id' INT NOT NULL,
  'titulo' VARCHAR(45) NULL,
  'isbn' VARCHAR(100) NULL,
  'idioma' VARCHAR(45) NULL,
  PRIMARY KEY ('id'));


insert into livro (id, titulo, isbn, idioma) values (1, 'Origin of Species', '0785819118', 'en');
insert into livro (id, titulo, isbn, idioma) values (2, 'Plato''s Republic', '1906787271', 'en');
insert into livro (id, titulo, isbn, idioma) values (3, 'Os Lusíadas', '0785819118', 'pt');
insert into livro (id, titulo, isbn, idioma) values (4, 'Les Miserables', '0140624155', 'fr');
insert into livro (id, titulo, isbn, idioma) values (5, 'Евгений Онегин', '5779310157', 'ru');