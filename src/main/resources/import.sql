
INSERT INTO `tbl_disciplinas` (`id`, `ch`, `nome`, `nome_professor`) VALUES
(2, '80', 'tjw', 'Corneli Jr'),
(3, '80', 'Sistemas Distribuídos', 'Fulano de tal');



INSERT INTO `tbl_endeco` (`id`, `bairro`, `cep`, `logradouro`) VALUES
(5, 'Jereissati I', '00000-000', 'Rua II'),
(8, 'Jereissati I', '00000-000', 'Rua II'),
(11, 'Jereissati I', '00000-000', 'Rua II');


INSERT INTO `tbl_sede` (`id`, `cidade`, `diretor`, `nome`) VALUES
(1, 'Maracanaú', 'Corneli Jr', 'Escola ABC');


INSERT INTO `tbl_telefone` (`id`, `iswpp`, `numero`, `tipo`) VALUES
(6, b'1', '85999999999', 'celular'),
(9, b'1', '85999999999', 'celular'),
(12, b'1', '85999999999', 'celular');


INSERT INTO `tbl_usuarios` (`id`, `dt_nascimento`, `email`, `nome`, `password`, `endereco_id`, `sede_id`) VALUES
(4, '2020-11-10', 'beltrano@gmail.com', 'Beltrano de tal', '123456', 5, 1),
(7, '2020-11-10', 'cicrano@gmail.com', 'Cicrano de tal', '123456', 8, 1),
(10, '2020-11-10', 'fulano@gmail.com', 'Beltrano de tal', '123456', 11, 1);


INSERT INTO `tbl_usuarios_disciplina` (`usuarios_id`, `disciplina_id`) VALUES
(4, 2),
(4, 3),
(7, 2),
(7, 3),
(10, 2),
(10, 3);


INSERT INTO `tbl_usuarios_telefone` (`usuarios_id`, `telefone_id`) VALUES
(4, 6),
(7, 9),
(10, 12);
