drop database if exists iris_1;
create database iris_1;

use iris_1;

create table etudiant (
	idetudiant int(5) not null auto_increment,
	nom varchar(50),
	prenom varchar(50),
	email varchar(100),
	dateNais date,
	primary key(idetudiant)
	);
insert into etudiant values
(null, "Johan", "Yohan", "y@gmail.com", "2000-10-10"),
(null, "Kons", "Yassine", "k@gmail.com", "2001-12-12"),
(null, "Nes", "Bogui", "a@gmail.com", "2002-05-05");

create table entreprise (
	ident int(5) not null auto_increment,
	nom varchar(50),
	statut enum("public", "prive", "autre"),
	adresse varchar(50),
	primary key(ident)
	);
insert into entreprise values 
(null, "SNCF", "public", "rue de paris 75"),
(null, "BNP", "prive", "rue de Lyon 75"),
(null, "Atos", "prive", "rue de Lille 78");

create table alternance (
	idalter int(5) not null auto_increment,
	dateDebut date,
	dateFin date,
	poste varchar(50),
	idetudiant int(5) not null,
	ident int(5) not null,
	primary key(idalter),
	foreign key (idetudiant) references etudiant(idetudiant),
	foreign key (ident) references entreprise(ident)
	);
insert into alternance values
(null, "2018-09-09", "2020-06-06", "web master", 1, 1),
(null, "2018-09-09", "2020-07-07", "développeur", 2, 1),
(null, "2018-09-09", "2020-08-08", "Dév applicatif", 3, 2);

create view tableau_bord as (
	select		e.nom, e.prenom, e.email, ets.nom as entreprise, ets.statut, a.dateDebut, a.dateFin, a.poste
	from		etudiant e, entreprise ets, alternance a
	where		e.idetudiant = a.idetudiant	
	and			ets.ident = a.ident
	order by 	e.nom 
)
	