DROP TABLE IF EXISTS gc_top_category;
CREATE TABLE gc_top_category(
	id INT PRIMARY KEY AUTO_INCREMENT,
	gc_id INT UNIQUE KEY ,
	gc_name VARCHAR(20) NOT NULL,
	link_count INT
);
INSERT INTO gc_top_category(gc_id,gc_name) VALUES(0,'可回收垃圾');
INSERT INTO gc_top_category(gc_id,gc_name) VALUES(1,'有害垃圾');
INSERT INTO gc_top_category(gc_id,gc_name) VALUES(2,'易腐垃圾');
INSERT INTO gc_top_category(gc_id,gc_name) VALUES(3,'其它垃圾');
COMMIT;
SELECT * FROM gc_top_category;

DROP TABLE IF EXISTS gc_second_category;
CREATE TABLE gc_second_category(
	id INT PRIMARY KEY AUTO_INCREMENT,
	gc_id VARCHAR(20) UNIQUE KEY,
	gc_name VARCHAR(20) NOT NULL,
	gc_parent_id INT,
	CONSTRAINT gc_id_fk FOREIGN KEY(gc_parent_id) REFERENCES gc_top_category(gc_id)
	
)
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('00','电池类',0);
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('01','灯管类',0);
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('02','家用化学品类',0);
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('03','其他类',0);
---------------可回收---------------------
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('10','废金属类',1);
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('11','废玻璃类',1);
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('12','废塑料类',1);
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('13','废纸类',1);
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('14','废织物类',1);
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('15','废旧电器电子产品',1);

---------------易腐---------------------
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('20','其他类',2);

---------------其他垃圾-----------------
INSERT INTO gc_second_category(gc_id,gc_name,gc_parent_id) VALUES('30','其他类',3);
SELECT* FROM gc_second_category;

SELECT * FROM gc_second_category WHERE gc_parent_id = (SELECT gc_id FROM gc_top_category WHERE gc_name = '可回收垃圾');
SELECT * FROM gc_second_category WHERE gc_parent_id IN (SELECT gc_id FROM gc_top_category WHERE gc_name = '有害垃圾'OR gc_name = '可回收垃圾') ;
SELECT * FROM gc_second_category WHERE gc_id LIKE '0_' OR gc_id LIKE '1%'  ;



COMMIT;