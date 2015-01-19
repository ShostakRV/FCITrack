-- Generated by Oracle SQL Developer Data Modeler 4.0.3.853
--   at:        2015-01-19 22:32:17 EET
--   site:      Oracle Database 11g
--   type:      Oracle Database 11g




CREATE TABLE COMMON_CONFIG
  (
    ID         INTEGER NOT NULL ,
    FK_FLOW    VARCHAR2 (29) NOT NULL ,
    FK_PRODUCT VARCHAR2 (29) NOT NULL ,
    FK_TW      VARCHAR2 (29) NOT NULL ,
    FK_GUI     INTEGER ,
    FK_EMAIL   INTEGER ,
    SEQUENCE   INTEGER ,
    FK_RELEASE INTEGER NOT NULL
  ) ;
ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COMMON_CONFIG_PK PRIMARY KEY ( ID ) ;

CREATE TABLE CONF_GUI_WS
  (
    ID          INTEGER NOT NULL ,
    FK_CONT_GUI INTEGER NOT NULL ,
    FK_WS       INTEGER NOT NULL
  ) ;
ALTER TABLE CONF_GUI_WS ADD CONSTRAINT CONF_GUI_WS_PK PRIMARY KEY ( ID ) ;

CREATE TABLE CONT_GUI_VERSION
  (
    ID           INTEGER NOT NULL ,
    FK_FLOW_CODE VARCHAR2 (29) NOT NULL ,
    VERSION      INTEGER ,
    FK_RELEASE   INTEGER NOT NULL
  ) ;
ALTER TABLE CONT_GUI_VERSION ADD CONSTRAINT CONT_GUI_VERSION_PK PRIMARY KEY ( ID ) ;

CREATE TABLE CONT_GUI_WS_PROPERTY
  (
    ID                 INTEGER NOT NULL ,
    FK_CONF_VERSION_WS INTEGER NOT NULL ,
    FK_PROPERTY        VARCHAR2 (29) NOT NULL
  ) ;
ALTER TABLE CONT_GUI_WS_PROPERTY ADD CONSTRAINT CONT_GUI_WS_PROPERTY_PK PRIMARY KEY ( ID ) ;

CREATE TABLE PRODUCT
  (
    CODE       VARCHAR2 (29) NOT NULL ,
    NAME       VARCHAR2 (4000) ,
    SEQ        INTEGER ,
    ACTIVE     CHAR (1) ,
    FK_RELEASE INTEGER NOT NULL
  ) ;
ALTER TABLE PRODUCT ADD CONSTRAINT PRODUCT_PK PRIMARY KEY ( CODE ) ;

CREATE TABLE PROD_PROCESS_DEF
  (
    CODE       VARCHAR2 (29) NOT NULL ,
    NAME       VARCHAR2 (4000) ,
    VERSION    INTEGER ,
    FK_RELEASE INTEGER NOT NULL
  ) ;
ALTER TABLE PROD_PROCESS_DEF ADD CONSTRAINT PROD_PROCESS_DEF_PK PRIMARY KEY ( CODE ) ;

CREATE TABLE PROPERTY_MAP
  (
    CODE       VARCHAR2 (29) NOT NULL ,
    NAME       VARCHAR2 (4000) ,
    FK_RELEASE INTEGER NOT NULL ,
    TYPE       VARCHAR2 (4000)
  ) ;
ALTER TABLE PROPERTY_MAP ADD CONSTRAINT PROPERTY_MAP_PK PRIMARY KEY ( CODE ) ;

CREATE TABLE RELEASE
  (
    ID           INTEGER NOT NULL ,
    NAME         VARCHAR2 (4000) ,
    RELEASE_DATE DATE
  ) ;
ALTER TABLE RELEASE ADD CONSTRAINT RELEASE_PK PRIMARY KEY ( ID ) ;

CREATE TABLE TECHNICAL_WORK
  (
    CODE       VARCHAR2 (29) NOT NULL ,
    NAME       VARCHAR2 (4000) ,
    TW_TYPE    VARCHAR2 (4000) ,
    FK_RELEASE INTEGER NOT NULL
  ) ;
ALTER TABLE TECHNICAL_WORK ADD CHECK ( TW_TYPE IN ('DISCONNECTED', 'STANDART', 'TEST')) ;
ALTER TABLE TECHNICAL_WORK ADD CONSTRAINT TECHNICAL_WORK_PK PRIMARY KEY ( CODE ) ;

CREATE TABLE WORKING_STATE
  ( ID INTEGER NOT NULL , NAME VARCHAR2 (4000)
  ) ;
ALTER TABLE WORKING_STATE ADD CONSTRAINT WORKING_STATE_PK PRIMARY KEY ( ID ) ;

ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COM_CONF_FLOW_FK FOREIGN KEY ( FK_FLOW ) REFERENCES PROD_PROCESS_DEF ( CODE ) ;

ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COM_CONF_PRODUCT_FK FOREIGN KEY ( FK_PRODUCT ) REFERENCES PRODUCT ( CODE ) ;

ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COM_CONF_RELEASE_FK FOREIGN KEY ( FK_RELEASE ) REFERENCES RELEASE ( ID ) ;

ALTER TABLE COMMON_CONFIG ADD CONSTRAINT COM_CONF_TECHNICAL_WORK_FK FOREIGN KEY ( FK_TW ) REFERENCES TECHNICAL_WORK ( CODE ) ;

ALTER TABLE CONT_GUI_VERSION ADD CONSTRAINT CONT_GUI_VERSION_FLOW_FK FOREIGN KEY ( FK_FLOW_CODE ) REFERENCES PROD_PROCESS_DEF ( CODE ) ;

ALTER TABLE CONT_GUI_VERSION ADD CONSTRAINT CONT_GUI_VERSION_RELEASE_FK FOREIGN KEY ( FK_RELEASE ) REFERENCES RELEASE ( ID ) ;

ALTER TABLE CONF_GUI_WS ADD CONSTRAINT C_GUI_WS_C_GUI_VERSION_FK FOREIGN KEY ( FK_CONT_GUI ) REFERENCES CONT_GUI_VERSION ( ID ) ;

ALTER TABLE CONT_GUI_WS_PROPERTY ADD CONSTRAINT C_GUI_WS_PROP_C_GUI_WS_FK FOREIGN KEY ( FK_CONF_VERSION_WS ) REFERENCES CONF_GUI_WS ( ID ) ;

ALTER TABLE CONT_GUI_WS_PROPERTY ADD CONSTRAINT C_GUI_WS_PROP_PROP_MAP_FK FOREIGN KEY ( FK_PROPERTY ) REFERENCES PROPERTY_MAP ( CODE ) ;

ALTER TABLE CONF_GUI_WS ADD CONSTRAINT C_GUI_WS_WORKING_STATE_FK FOREIGN KEY ( FK_WS ) REFERENCES WORKING_STATE ( ID ) ;

ALTER TABLE PROD_PROCESS_DEF ADD CONSTRAINT FLOW_RELEASE_FK FOREIGN KEY ( FK_RELEASE ) REFERENCES RELEASE ( ID ) ;

ALTER TABLE PRODUCT ADD CONSTRAINT PRODUCT_RELEASE_FK FOREIGN KEY ( FK_RELEASE ) REFERENCES RELEASE ( ID ) ;

ALTER TABLE PROPERTY_MAP ADD CONSTRAINT PROPERTY_MAP_RELEASE_FK FOREIGN KEY ( FK_RELEASE ) REFERENCES RELEASE ( ID ) ;

ALTER TABLE TECHNICAL_WORK ADD CONSTRAINT TECHNICAL_WORK_RELEASE_FK FOREIGN KEY ( FK_RELEASE ) REFERENCES RELEASE ( ID ) ;


-- Oracle SQL Developer Data Modeler Summary Report: 
-- 
-- CREATE TABLE                            10
-- CREATE INDEX                             0
-- ALTER TABLE                             25
-- CREATE VIEW                              0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
