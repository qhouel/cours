DROP DATABASE IF EXISTS XYZ_db;

CREATE DATABASE IF NOT EXISTS XYZ_db;
USE XYZ_db;
# -----------------------------------------------------------------------------
#       TABLE : INTERVENTION
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS INTERVENTION
(
 IDINTER INTEGER NOT NULL AUTO_INCREMENT ,
 IDPRO INTEGER NOT NULL  ,
 IDEMP INTEGER NOT NULL  ,
 IDCLI INTEGER NOT NULL  ,
 DATEI DATETIME NULL  ,
 DUREE TIME NULL  ,
 DATEHDEB DATETIME NULL  ,
 DATEHFIN DATETIME NULL  , 
 TAUXHORAIRE DECIMAL(3,2) NULL,
 PRIMARY KEY (IDINTER) 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : LIVRAISON
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS LIVRAISON
(
 IDLIVR INTEGER NOT NULL AUTO_INCREMENT ,
 REFCOMM INTEGER NOT NULL  
 , PRIMARY KEY (IDLIVR) 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : CLIENT
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS CLIENT
(
 IDCLI INTEGER default 0,
 NOM CHAR(32) NULL  ,
 PRENOM CHAR(32) NULL  ,
 ADRESSE CHAR(32) NULL  ,
 VILLE CHAR(20) NULL ,
 CODE_POSTAL CHAR(5) NULL ,
 EMAIL CHAR(32) NULL  ,
 TELEPHONE CHAR(32) NULL  ,
 MDP CHAR(32) NOT NULL
 , PRIMARY KEY (IDCLI) 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : PROFESSIONNEL
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS PROFESSIONNEL
(
 IDCLI INTEGER default 0,
 RAISON_SOCIALE CHAR(32) NULL  ,
 SIRET INTEGER NULL  ,
 NOM CHAR(32) NULL  ,
 PRENOM CHAR(32) NULL  ,
 ADRESSE CHAR(32) NULL  ,
 VILLE CHAR(20) NULL ,
 CODE_POSTAL CHAR(5) NULL ,
 EMAIL CHAR(32) NULL  ,
 TELEPHONE CHAR(32) NULL  ,
 MDP CHAR(32) NOT NULL 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : TECHNICIEN
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS TECHNICIEN
(
 IDEMP INTEGER NOT NULL AUTO_INCREMENT ,
 NOM CHAR(32) NULL  ,
 PRENOM CHAR(32) NULL  ,
 FONCTION CHAR(32) NULL  
 , PRIMARY KEY (IDEMP) 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : PRODUIT
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS PRODUIT
(
 IDPRO INTEGER NOT NULL AUTO_INCREMENT ,
 CATEGORIE CHAR(32) NULL  ,
 NOMPRO CHAR(32) NULL  ,
 DESCRIPTION CHAR(32) NULL  ,
 PRIX DECIMAL(10,2) NULL 	,
 POIDS DECIMAL(10,2) NULL  ,
 VOLUME DECIMAL(10,2) NULL  ,
 STOCK CHAR(32) NULL  ,
 PHOTO VARCHAR(100) NULL  
 , PRIMARY KEY (IDPRO) 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : ENTREPOT
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS ENTREPOT
(
 IDENTR INTEGER NOT NULL AUTO_INCREMENT ,
 ZONE_GEOGRAPHIQUE enum('Alsace', 'Aquitaine', 'Auvergne', 'Basse Normandie', 'Bourgogne', 'Bretagne', 'Centre', 'Champagne-Ardenne', 'Corse', 'Franche-Comté', 'Haute Normandie', 'Ile-de-France', 'Languedoc-Roussillon', 'Limousin', 'Lorraine', 'Midi-Pyrénées', 'Nord-Pas-de-Calais', 'Pays de la Loire', 'Picardie', 'Poitou-Charentes', 'Provence-Alpes-Côte-Azur', 'Rhône-Alpes', 'Régions outre-mer', 'Guadeloupe', 'Martinique', 'Guyane', 'La Réunion', 'Mayotte') ,
 ADRESSE CHAR(32) NULL  ,
 CODE_POSTAL INTEGER NULL  
 , PRIMARY KEY (IDENTR) 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : COMMANDES
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS COMMANDES
(
 REFCOMM INTEGER NOT NULL AUTO_INCREMENT ,
 IDCLI INTEGER NOT NULL  ,
 DATECOMM DATETIME NULL  ,
 DATELIVRAISON DATETIME NULL 
 , PRIMARY KEY (REFCOMM) 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : FACTURATION
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS FACTURE
(
 IDFACTURE INTEGER NOT NULL AUTO_INCREMENT ,
 REFCOMM INTEGER NOT NULL ,
 DATEFACT DATE NULL  ,
 MONTANT DECIMAL(10,2) NULL   
 , PRIMARY KEY (IDFACTURE) 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : PARTICULIER
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS PARTICULIER
(
 IDCLI INTEGER default 0 ,
 PRENOM CHAR(32) NULL  ,
 NOM CHAR(32) NULL  ,
 ADRESSE CHAR(32) NULL  ,
 VILLE CHAR(20) NULL ,
 CODE_POSTAL CHAR(5) NULL ,
 EMAIL CHAR(32) NULL  ,
 TELEPHONE CHAR(32) NULL  ,
 MDP CHAR(32) NOT NULL   
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : STOCKER
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS STOCKER
(
 IDPRO INTEGER NOT NULL  ,
 IDENTR INTEGER NOT NULL  ,
 QTESTOCK INTEGER NULL  
 , PRIMARY KEY (IDPRO,IDENTR) 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : LIGNECOMMANDE
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS LIGNECOMMANDE
(
 REFCOMM INTEGER NOT NULL  ,
 IDPRO INTEGER NOT NULL  ,
 QTE INTEGER NULL  ,
 REMISE INTEGER NULL  
 , PRIMARY KEY (REFCOMM,IDPRO) 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : H_FACTURATION Table d'historisation des modifications de la table FACTURATION
# -----------------------------------------------------------------------------

create table contentieuxFact as select * from facture where 2=0;
create table h_facture as select * from contentieuxFact where 2 = 0;

# -----------------------------------------------------------------------------
#       TABLE : H_CLIENT Table d'historisation des modifications de la table CLIENT
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS H_CLIENT
(
 IDCLI INTEGER ,
 DATE_HISTO DATE NOT NULL  ,
 NOM CHAR(32) NULL  ,
 PRENOM CHAR(32) NULL  ,
 ADRESSE CHAR(32) NULL  ,
 VILLE CHAR(20) NULL ,
 CODE_POSTAL CHAR(5) NULL ,
 EMAIL CHAR(32) NULL  ,
 TELEPHONE CHAR(32) NULL  ,
 MDP CHAR(32) NOT NULL  
 , PRIMARY KEY (IDCLI,DATE_HISTO) 
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : H_INTERVENTION Table d'historisation des modifications de la table INTERVENTION
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS H_INTERVENTION
(
 IDINTER INTEGER NOT NULL AUTO_INCREMENT ,
 IDPRO INTEGER NOT NULL  ,
 IDEMP INTEGER NOT NULL  ,
 IDCLI INTEGER NOT NULL  ,
 DATE_HISTO DATE NOT NULL ,
 DATEI DATETIME NULL  ,
 DUREE TIME NULL  ,
 DATEHDEB DATETIME NULL  ,
 DATEHFIN DATETIME NULL  , 
 TAUXHORAIRE DECIMAL(3,2) NULL,
 PRIMARY KEY (IDINTER,DATE_HISTO) 
 ) ;

# -----------------------------------------------------------------------------
#       CREATION DES REFERENCES DE TABLE
# -----------------------------------------------------------------------------

ALTER TABLE INTERVENTION 
ADD FOREIGN KEY FK_INTERVENTION_PRODUIT (IDPRO)
REFERENCES PRODUIT (IDPRO) ;


ALTER TABLE INTERVENTION 
ADD FOREIGN KEY FK_INTERVENTION_TECHNICIEN (IDEMP)
REFERENCES TECHNICIEN (IDEMP) ;


ALTER TABLE INTERVENTION 
ADD FOREIGN KEY FK_INTERVENTION_CLIENT (IDCLI)
REFERENCES CLIENT (IDCLI) ;


ALTER TABLE LIVRAISON 
ADD FOREIGN KEY FK_LIVRAISON_COMMANDES (REFCOMM)
REFERENCES COMMANDES (REFCOMM) ;


ALTER TABLE COMMANDES 
ADD FOREIGN KEY FK_COMMANDES_CLIENT (IDCLI)
REFERENCES CLIENT (IDCLI) 
ON DELETE CASCADE ;

ALTER TABLE FACTURE
ADD FOREIGN KEY FK_FACTURE_COMMANDES (REFCOMM)
REFERENCES COMMANDES (REFCOMM)
ON DELETE CASCADE ;

ALTER TABLE STOCKER 
ADD FOREIGN KEY FK_STOCKER_PRODUIT (IDPRO)
REFERENCES PRODUIT (IDPRO) ;


ALTER TABLE STOCKER 
ADD FOREIGN KEY FK_STOCKER_ENTREPOT (IDENTR)
REFERENCES ENTREPOT (IDENTR) ;


ALTER TABLE LIGNECOMMANDE 
ADD FOREIGN KEY FK_LIGNECOMMANDE_COMMANDES (REFCOMM)
REFERENCES COMMANDES (REFCOMM) ;


ALTER TABLE LIGNECOMMANDE 
ADD FOREIGN KEY FK_LIGNECOMMANDE_PRODUIT (IDPRO)
REFERENCES PRODUIT (IDPRO) ;


ALTER TABLE H_FACTURE 
ADD FOREIGN KEY FK_H_FACTURE_FACTURE (IDFACTURE)
REFERENCES FACTURE (IDFACTURE) ;


ALTER TABLE H_CLIENT 
ADD FOREIGN KEY FK_H_CLIENT_CLIENT (IDCLI)
REFERENCES CLIENT (IDCLI) ;


ALTER TABLE H_INTERVENTION 
ADD FOREIGN KEY FK_H_INTERVENTION_INTERVENTION (IDINTER)
REFERENCES INTERVENTION (IDINTER) ;

# -----------------------------------------------------------------------------
#      TRIGGER TABLE : Ajout Particulier
# -----------------------------------------------------------------------------

drop trigger if exists ajout_particulier;
DELIMITER //
Create trigger ajout_particulier
before insert 
on particulier 
for each ROW
Begin
Declare numA , s, numC int;
select max(idcli) into numA 
from client;
if numA is null or numA = 0
then
set numA = 1;
set new.idcli = numA;
else
set numA = numA+1;
set new.idcli = numA;
end if;
select count(*) into s
from PROFESSIONNEL
where IDCLI = new.IDCLI;
if s > 0
then 
signal sqlstate'45000' 
set message_text = 'utilisateur deja present';
end if;
insert into client 
values (numA, new.NOM, new.PRENOM, new.ADRESSE, new.VILLE, new.CODE_POSTAL, new.EMAIL, new.TELEPHONE, new.MDP);
end //
DELIMITER ;

# -----------------------------------------------------------------------------
#      TRIGGER TABLE : Ajout Professionnel
# -----------------------------------------------------------------------------
drop trigger if exists ajout_professionnel;
DELIMITER //
Create trigger ajout_professionnel
before insert 
on PROFESSIONNEL 
for each ROW
Begin
Declare numA , s, numC int;
select max(idcli) into numA 
from client;
if numA is null
then
set numA = 1;
set new.idcli = numA;
else
set numA = numA+1;
set new.idcli = numA;
end if;
select count(*) into s
from particulier
where IDCLI = new.IDCLI;
if s > 0
then 
signal sqlstate'45000' 
set message_text = 'utilisateur deja present';
end if;
insert into client values (numA, new.NOM, new.PRENOM, new.ADRESSE, new.VILLE, new.CODE_POSTAL, new.EMAIL, new.TELEPHONE, new.MDP);
end// 
DELIMITER ;

# -----------------------------------------------------------------------------
#      TRIGGER TABLE : Delete particulier
# -----------------------------------------------------------------------------


Drop trigger if exists delete_particulier_on_cascade;
DELIMITER //
Create trigger delete_particulier_on_cascade
after delete 
on PARTICULIER
for each ROW
Begin
delete from CLIENT where IDCLI = old.IDCLI;
end //
DELIMITER ;


# -----------------------------------------------------------------------------
#      TRIGGER TABLE : Delete professionnel
# -----------------------------------------------------------------------------


Drop trigger if exists delete_professionnel_on_cascade;
DELIMITER //
Create trigger delete_professionnel_on_cascade
after delete 
on PROFESSIONNEL
for each ROW
Begin
delete from CLIENT where IDCLI = old.IDCLI;
end //
DELIMITER ;

# -----------------------------------------------------------------------------
#      TRIGGER TABLE : Delete client
# -----------------------------------------------------------------------------


Drop trigger if exists delete_client_on_cascade;
DELIMITER //
Create trigger delete_client_on_cascade
after delete 
on CLIENT
for each ROW
Begin
if old.IDCLI in (select IDCLI from PARTICULIER)
then 
delete from PARTICULIER where IDCLI = old.IDCLI;
  else 
  delete from PROFESSIONNEL where idcli = old.IDCLI;
end if;
end //
DELIMITER ;


# -----------------------------------------------------------------------------
#      INSERT TABLE : Particulier
# -----------------------------------------------------------------------------

INSERT INTO particulier values 
(null, 'Virgile','Barbera', '3 rue des bouleaux', 'Paris', '75000', 'coucou@hiboux.com', '0102030405', 'bonjour'),
(null, 'Quentin','Houel', '3 rue des arbres', 'Paris', '75000', 'hiboux@coucou.com', '0623548678', 'bonjour'),
(null, 'Eviatar','Houri', '5 rue des igloos', 'Paris', '75000', 'bonjour@hiboux.com', '0602030405', 'bonjour'),
(null, 'Donald','Trump', 'maison blanche', 'Paris', '75000', 'donald@whitehouse.com', '0902030405', 'bonjour'),
(null, 'Emmanuel','Macron', 'elysée', 'Paris', '75000', 'manu@notreprojet.com', '0402030405', 'bonjour');


# -----------------------------------------------------------------------------
#      INSERT TABLE : Professionnel
# -----------------------------------------------------------------------------

insert INTO PROFESSIONNEL values
  (Null, 'bonjour', '555664448', 'bondour', 'lotusrouge', 'palais du nem', 'Pekin', '31548', 'bondour@lotusrouge.com', '0102030405', 'bonjour'),
  (Null, 'toto', '987654321', 'tata', 'titi', 'bonjour.png', 'Paris', '75010', 'toto@bonjour.com', '0102030405', 'bonjour'),
  (Null, 'bonnet', '123456789', 'ponpon', 'pupu', '5 rue de la laine', 'Paris', '75011', 'ponpon@bonnet.com', '0102030405', 'bonjour'),
  (Null, 'la bonne soupe', '987654321', 'la bonne', 'soupe', '2 rue des légumes', 'Paris', '75009', 'soupe@legumes.com', '0102030405', 'bonjour'),
  (Null, 'fleur de sel', '987654321', 'romain', 'klexos', 'marais salant', 'Paris', '75013', 'sel@baleine.com', '0102030405', 'bonjour');

insert into PRODUIT values
	(null, 'Moteur', 'BMW', 'moteur qui va vite', '350', '100', '100', '50', 'images/BMW.png'),
	(null, 'Tournevis', 'tournevis bleu', 'tourne les vis bleues', '5', '0.100', '1', '600', 'images/tournevis.jpg'),
	(null, 'Batterie', 'Bosh', 'la batterie de ta vie', '70', '15', '1', '150', 'images/batterie.jpg'),
	(null, 'Pinces croco', 'Gys', 'le cable qui recharge ta vie', '157', '1', '1', '100', 'images/cable.jpg'),
	(null, 'Disque frein', 'Bosh', 'les disques qui freinent vite', '42', '2', '1', '75', 'images/disques.jpg');


	ALTER table Client
add nbFactures integer default 0;

	ALTER table H_CLIENT
add nbFactures integer default 0;

	ALTER table professionnel
add nbFactures integer default 0;

	ALTER table particulier
add nbFactures integer default 0;


# -----------------------------------------------------------------------------
#      TRIGGER TABLE : CLIENT COMPTEUR NB FACTURE
# -----------------------------------------------------------------------------

Drop trigger if exists nbFacture;
DELIMITER //
Create trigger nbFacture
after insert on Commandes
for each ROW
Begin
update Client 
	set nbFactures = nbFactures +1 
	where idcli = new.idcli ;
if new.idcli = (select idcli from particulier where idcli=new.idcli)
then update particulier
set nbFactures = nbFactures + 1 where idcli = new.idcli;
elseif (select idcli from professionnel where idcli=new.idcli)
then update professionnel
set nbFactures = nbFactures + 1
where idcli = new.idcli;
end if ;
end //
DELIMITER ;


insert into commandes values
	(null, 3, '2020-05-01', '2020-05-10'),
	(null, 4, '2020-01-10', '2019-01-15');
/*
update client set nbFactures = 0 where nbFactures >0;
update particulier set nbFactures = 0 where nbFactures >0;
*/
-------------------------- GESTION STOCK --------------------
--------------------------	TRIGGER ------------------------

Drop trigger if exists GestStock;
delimiter //
create trigger GestStock
before insert on LIGNECOMMANDE
for each ROW
Begin
if (select stock from produit where idpro = new.idpro) < new.qte
then
signal sqlstate '45000' set message_text = 'calma te Bro ya pas assez';
else 
update produit 
	set stock = stock - new.qte where idpro = new.idpro;
	end if ;
end //
delimiter ; 

insert into LIGNECOMMANDE values
	(1, 3, 10, 0);


-----------------Procedure TTC/TVA/HT -------------------
/*
CREATE TABLE IF NOT EXISTS FACTURE
(
 IDFACTURE INTEGER NOT NULL AUTO_INCREMENT ,
 REFCOMM INTEGER NOT NULL ,
 DATEFACT DATE NULL  ,
 MONTANT DECIMAL(10,2) NULL   
 , PRIMARY KEY (IDFACTURE) 
 ) ;


Alter table facture modify HT decimal(10,2) default 0;
Alter table Facture modify TVA decimal(10,2) default 0;
Alter table Facture modify montant decimal(10,2) default 0;
alter table facture drop refcomm;

Drop trigger if exists CalculMontant;
delimiter //
create trigger CalculMontant
after insert on LigneFact
for each ROW
Begin
declare mht, mtva, mttc decimal(10,2);
select sum(prix * qte), sum(prix * qte) * 0.2, sum(prix * qte)*1.20
into mht, mtva, mttc from produit, LigneFact
where produit.idpro = LigneFact.idpro
and IDFACTURE = new.IDFACTURE;
update Facture
set ht = mht, tva = mtva, montant = mttc, 
DATEFACT = curdate()
where IDFACTURE = new.IDFACTURE;
end //
delimiter ;


Create table LigneFact (
IDFACTURE int not null,
idpro int not null,
qte int,
primary key(IDFACTURE, idpro),
foreign key (IDFACTURE) REFERENCES facture(IDFACTURE),
foreign key (idpro) REFERENCES produit(idpro)
);

insert into LigneFact values
	(1, 1, 10);


insert into facture(IDFACTURE, DATEFACT) values
	(2, curdate());
*/




alter table FACTURE add DATER date;


drop trigger if exists GestionFact;
delimiter //
create trigger GestionFact
Before delete on Facture
for each row
Begin
if datediff(curdate(), old.DATEFACT) < 30 
then signal sqlstate '45000' set message_text = 'Impossible de supprimer';
elseif (old.DATER is not null)
then insert into h_facture select * from facture where IDFACTURE = old.IDFACTURE;
elseif datediff(curdate(), old.DATEFACT) > 30 
then insert into contentieuxFact select * from facture where IDFACTURE = old.IDFACTURE;
end if;
end // 
delimiter ;


insert into facture values
	(1, 5,'2019-02-10', 100, '2019-02-15');

