-- Generated by Oracle SQL Developer Data Modeler 4.0.3.853
--   at:        2015-01-30 14:50:58 EET
--   site:      Oracle Database 11g
--   type:      Oracle Database 11g

DROP TABLE COMMON_CONFIG CASCADE CONSTRAINTS ;

DROP TABLE EMAIL CASCADE CONSTRAINTS ;

CREATE TABLE COMMON_CONFIG
(
  ID         INTEGER NOT NULL ,
  FK_FLOW    VARCHAR2 (29) NOT NULL ,
  FK_PRODUCT VARCHAR2 (29) NOT NULL ,
  FK_TW      VARCHAR2 (29) NOT NULL ,
  FK_GUI     INTEGER NOT NULL ,
  FK_EMAIL   INTEGER NOT NULL ,
  SEQUENCE   INTEGER ,
  FK_RELEASE INTEGER NOT NULL ,
  OUTPHASE   CHAR (1)
) ;
ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COMMON_CONFIG_PK PRIMARY KEY ( ID ) ;

CREATE TABLE EMAIL
(
  ID      INTEGER NOT NULL ,
  ADDRESS VARCHAR2 (4000) ,
  FK_WS   INTEGER
) ;
ALTER TABLE EMAIL ADD CONSTRAINT EMAIL_PK PRIMARY KEY ( ID ) ;

ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COM_CONF_CONT_GUI_VERSION_FK FOREIGN KEY ( FK_GUI ) REFERENCES CONT_GUI_VERSION ( ID ) ;

ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COM_CONF_EMAIL_FK FOREIGN KEY ( FK_EMAIL ) REFERENCES EMAIL ( ID ) ;

ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COM_CONF_FLOW_FK FOREIGN KEY ( FK_FLOW ) REFERENCES PROD_PROCESS_DEF ( CODE ) ;

ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COM_CONF_PRODUCT_FK FOREIGN KEY ( FK_PRODUCT ) REFERENCES PRODUCT ( CODE ) ;

ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COM_CONF_RELEASE_FK FOREIGN KEY ( FK_RELEASE ) REFERENCES RELEASE ( ID ) ;

ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COM_CONF_TECHNICAL_WORK_FK FOREIGN KEY ( FK_TW ) REFERENCES TECHNICAL_WORK ( CODE ) ;

DROP SEQUENCE COMMON_CONFIG_ID_SEQ;
CREATE SEQUENCE COMMON_CONFIG_ID_SEQ START WITH 1 NOCACHE ORDER;
DROP TRIGGER COMMON_CONFIG_ID_TRG;
CREATE OR REPLACE TRIGGER COMMON_CONFIG_ID_TRG BEFORE
INSERT ON COMMON_CONFIG FOR EACH ROW WHEN (NEW.ID IS NULL) BEGIN :NEW.ID := COMMON_CONFIG_ID_SEQ.NEXTVAL;
END;
/

DROP SEQUENCE EMAIL_ID_SEQ;
CREATE SEQUENCE EMAIL_ID_SEQ START WITH 1 NOCACHE ORDER ;
DROP TRIGGER EMAIL_ID_TRG;
CREATE OR REPLACE TRIGGER EMAIL_ID_TRG BEFORE
INSERT ON EMAIL FOR EACH ROW WHEN (NEW.ID IS NULL) BEGIN :NEW.ID := EMAIL_ID_SEQ.NEXTVAL;
END;
/
