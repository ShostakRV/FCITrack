--------------------------------------------------------
--  File created - �����-������-08-2015   
--------------------------------------------------------
DROP TABLE "ITR_CONF"."COMMON_CONFIG" cascade constraints;
DROP TABLE "ITR_CONF"."CONF_GUI_WS" cascade constraints;
DROP TABLE "ITR_CONF"."CONT_GUI_VERSION" cascade constraints;
DROP TABLE "ITR_CONF"."CONT_GUI_VERSION_CONF_GUI_WS" cascade constraints;
DROP TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" cascade constraints;
DROP TABLE "ITR_CONF"."EMAIL" cascade constraints;
DROP TABLE "ITR_CONF"."PROD_PROCESS_DEF" cascade constraints;
DROP TABLE "ITR_CONF"."PRODUCT" cascade constraints;
DROP TABLE "ITR_CONF"."PROPERTY_MAP" cascade constraints;
DROP TABLE "ITR_CONF"."RELEASE" cascade constraints;
DROP TABLE "ITR_CONF"."TECHNICAL_WORK" cascade constraints;
DROP TABLE "ITR_CONF"."WORKING_STATE" cascade constraints;
--------------------------------------------------------
--  DDL for Sequence COMMON_CONFIG_ID_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "ITR_CONF"."COMMON_CONFIG_ID_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence CONF_GUI_WS_ID_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "ITR_CONF"."CONF_GUI_WS_ID_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence CONT_GUI_VERSION_ID_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "ITR_CONF"."CONT_GUI_VERSION_ID_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence CONT_GUI_WS_PROPERTY_ID_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "ITR_CONF"."CONT_GUI_WS_PROPERTY_ID_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence EMAIL_ID_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "ITR_CONF"."EMAIL_ID_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence RELEASE_ID_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "ITR_CONF"."RELEASE_ID_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 3 NOCACHE  ORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence WORKING_STATE_ID_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "ITR_CONF"."WORKING_STATE_ID_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Table COMMON_CONFIG
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."COMMON_CONFIG" 
   (	"ID" NUMBER(*,0), 
	"FK_FLOW" VARCHAR2(29 BYTE), 
	"FK_PRODUCT" VARCHAR2(29 BYTE), 
	"FK_TW" VARCHAR2(29 BYTE), 
	"FK_GUI" NUMBER(*,0), 
	"FK_EMAIL" NUMBER(*,0), 
	"SEQUENCE" NUMBER(*,0), 
	"FK_RELEASE" NUMBER(*,0), 
	"OUTPHASE" CHAR(1 BYTE), 
	"VALID" NUMBER(1,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CONF_GUI_WS
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."CONF_GUI_WS" 
   (	"ID" NUMBER(*,0), 
	"FK_CONT_GUI" NUMBER(*,0), 
	"FK_WS" NUMBER(*,0), 
	"FK_COUNT_GUI" NUMBER(10,0), 
	"ROLE" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CONT_GUI_VERSION
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."CONT_GUI_VERSION" 
   (	"ID" NUMBER(*,0), 
	"FK_FLOW_CODE" VARCHAR2(29 BYTE), 
	"VERSION" NUMBER(*,0), 
	"FK_RELEASE" NUMBER(*,0), 
	"NAME" VARCHAR2(255 BYTE), 
	"VALID" NUMBER(1,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CONT_GUI_VERSION_CONF_GUI_WS
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."CONT_GUI_VERSION_CONF_GUI_WS" 
   (	"CONT_GUI_VERSION_ID" NUMBER(19,0), 
	"CONFGUIWSES_ID" NUMBER(19,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CONT_GUI_WS_PROPERTY
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" 
   (	"ID" NUMBER(*,0), 
	"FK_CONF_VERSION_WS" NUMBER(*,0), 
	"FK_PROPERTY" VARCHAR2(29 BYTE), 
	"FK_CONF_VERSION" NUMBER(10,0), 
	"VALUE" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table EMAIL
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."EMAIL" 
   (	"ID" NUMBER(*,0), 
	"ADDRESS" VARCHAR2(4000 BYTE), 
	"FK_WS" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PROD_PROCESS_DEF
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."PROD_PROCESS_DEF" 
   (	"CODE" VARCHAR2(29 BYTE), 
	"NAME" VARCHAR2(4000 BYTE), 
	"VERSION" NUMBER(*,0), 
	"FK_RELEASE" NUMBER(*,0), 
	"VALID" NUMBER(1,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PRODUCT
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."PRODUCT" 
   (	"CODE" VARCHAR2(29 BYTE), 
	"NAME" VARCHAR2(4000 BYTE), 
	"SEQ" NUMBER(*,0), 
	"ACTIVE" CHAR(1 BYTE), 
	"FK_RELEASE" NUMBER(*,0), 
	"DELETED" NUMBER(1,0), 
	"VALID" NUMBER(1,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PROPERTY_MAP
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."PROPERTY_MAP" 
   (	"CODE" VARCHAR2(29 BYTE), 
	"NAME" VARCHAR2(4000 BYTE), 
	"FK_RELEASE" NUMBER(*,0), 
	"TYPE" VARCHAR2(4000 BYTE), 
	"ACTIVE" CHAR(1 BYTE), 
	"VALID" NUMBER(1,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table RELEASE
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."RELEASE" 
   (	"ID" NUMBER(*,0), 
	"NAME" VARCHAR2(4000 BYTE), 
	"RELEASE_DATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TECHNICAL_WORK
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."TECHNICAL_WORK" 
   (	"CODE" VARCHAR2(29 BYTE), 
	"NAME" VARCHAR2(4000 BYTE), 
	"TW_TYPE" VARCHAR2(4000 BYTE), 
	"FK_RELEASE" NUMBER(*,0), 
	"DELETED" NUMBER(1,0), 
	"VALID" NUMBER(1,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table WORKING_STATE
--------------------------------------------------------

  CREATE TABLE "ITR_CONF"."WORKING_STATE" 
   (	"ID" NUMBER(*,0), 
	"NAME" VARCHAR2(4000 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into ITR_CONF.COMMON_CONFIG
SET DEFINE OFF;
REM INSERTING into ITR_CONF.CONF_GUI_WS
SET DEFINE OFF;
REM INSERTING into ITR_CONF.CONT_GUI_VERSION
SET DEFINE OFF;
REM INSERTING into ITR_CONF.CONT_GUI_VERSION_CONF_GUI_WS
SET DEFINE OFF;
REM INSERTING into ITR_CONF.CONT_GUI_WS_PROPERTY
SET DEFINE OFF;
REM INSERTING into ITR_CONF.EMAIL
SET DEFINE OFF;
Insert into ITR_CONF.EMAIL (ID,ADDRESS,FK_WS) values ('882','test2@mail.com',null);
Insert into ITR_CONF.EMAIL (ID,ADDRESS,FK_WS) values ('781','qwe@mail.com',null);
Insert into ITR_CONF.EMAIL (ID,ADDRESS,FK_WS) values ('892','test@mail.com',null);
Insert into ITR_CONF.EMAIL (ID,ADDRESS,FK_WS) values ('893','test@mail.com',null);
Insert into ITR_CONF.EMAIL (ID,ADDRESS,FK_WS) values ('914','asdasd@asdasd',null);
Insert into ITR_CONF.EMAIL (ID,ADDRESS,FK_WS) values ('911','gad@mail.ru',null);
Insert into ITR_CONF.EMAIL (ID,ADDRESS,FK_WS) values ('915','zzzzzzzzzzzzzzzz',null);
Insert into ITR_CONF.EMAIL (ID,ADDRESS,FK_WS) values ('913','gad@mail.ru',null);
Insert into ITR_CONF.EMAIL (ID,ADDRESS,FK_WS) values ('916','zxczxczxc',null);
Insert into ITR_CONF.EMAIL (ID,ADDRESS,FK_WS) values ('840','test22@mail.com',null);
Insert into ITR_CONF.EMAIL (ID,ADDRESS,FK_WS) values ('845','test@mail.com',null);
REM INSERTING into ITR_CONF.PROD_PROCESS_DEF
SET DEFINE OFF;
Insert into ITR_CONF.PROD_PROCESS_DEF (CODE,NAME,VERSION,FK_RELEASE,VALID) values ('sasdzxc','asdsad','1','760',null);
Insert into ITR_CONF.PROD_PROCESS_DEF (CODE,NAME,VERSION,FK_RELEASE,VALID) values ('zxc','xcx','1','761',null);
Insert into ITR_CONF.PROD_PROCESS_DEF (CODE,NAME,VERSION,FK_RELEASE,VALID) values ('qwe','qwe','1','762',null);
REM INSERTING into ITR_CONF.PRODUCT
SET DEFINE OFF;
Insert into ITR_CONF.PRODUCT (CODE,NAME,SEQ,ACTIVE,FK_RELEASE,DELETED,VALID) values ('wap','wap','2','1','760',null,null);
Insert into ITR_CONF.PRODUCT (CODE,NAME,SEQ,ACTIVE,FK_RELEASE,DELETED,VALID) values ('gprs','gprs','1','1','762',null,null);
Insert into ITR_CONF.PRODUCT (CODE,NAME,SEQ,ACTIVE,FK_RELEASE,DELETED,VALID) values ('sms','sms','2','1','760',null,null);
Insert into ITR_CONF.PRODUCT (CODE,NAME,SEQ,ACTIVE,FK_RELEASE,DELETED,VALID) values ('mms','mms�','3','1','761',null,null);
REM INSERTING into ITR_CONF.PROPERTY_MAP
SET DEFINE OFF;
Insert into ITR_CONF.PROPERTY_MAP (CODE,NAME,FK_RELEASE,TYPE,ACTIVE,VALID) values ('pan01','pan111','761','LABEL','1',null);
Insert into ITR_CONF.PROPERTY_MAP (CODE,NAME,FK_RELEASE,TYPE,ACTIVE,VALID) values ('input1','input1','762','INPUT','1',null);
REM INSERTING into ITR_CONF.RELEASE
SET DEFINE OFF;
Insert into ITR_CONF.RELEASE (ID,NAME,RELEASE_DATE) values ('760','release2',null);
Insert into ITR_CONF.RELEASE (ID,NAME,RELEASE_DATE) values ('761','release4',to_date('05.02.2015','DD.MM.RRRR'));
Insert into ITR_CONF.RELEASE (ID,NAME,RELEASE_DATE) values ('762','release1',null);
REM INSERTING into ITR_CONF.TECHNICAL_WORK
SET DEFINE OFF;
Insert into ITR_CONF.TECHNICAL_WORK (CODE,NAME,TW_TYPE,FK_RELEASE,DELETED,VALID) values ('qwe','qwe','STANDART','761',null,null);
Insert into ITR_CONF.TECHNICAL_WORK (CODE,NAME,TW_TYPE,FK_RELEASE,DELETED,VALID) values ('asd','aaaad','TEST','762',null,null);
REM INSERTING into ITR_CONF.WORKING_STATE
SET DEFINE OFF;
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('900','qweasd');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('901','sdfsdfcx');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('902','asdzxc');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('904','asdasd');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('905','zxczxc');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('906','reecvrv');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('907','zfdfdsvz');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('908','ascrecax');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('909','dfzxvfdv');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('920','asdxzvzxcv');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('921','rybtrnth');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('922','xtfhgfghdg');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('923','nyuitnyui');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('770','Ws1');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('771','Ws2');
Insert into ITR_CONF.WORKING_STATE (ID,NAME) values ('772','Ws3');
--------------------------------------------------------
--  DDL for Index COMMON_CONFIG_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."COMMON_CONFIG_PK" ON "ITR_CONF"."COMMON_CONFIG" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index CONF_GUI_WS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."CONF_GUI_WS_PK" ON "ITR_CONF"."CONF_GUI_WS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index CONT_GUI_VERSION_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."CONT_GUI_VERSION_PK" ON "ITR_CONF"."CONT_GUI_VERSION" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index UK_91TEQDUERQ526TTFXMI2XLIV7
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."UK_91TEQDUERQ526TTFXMI2XLIV7" ON "ITR_CONF"."CONT_GUI_VERSION_CONF_GUI_WS" ("CONFGUIWSES_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index CONT_GUI_WS_PROPERTY_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."CONT_GUI_WS_PROPERTY_PK" ON "ITR_CONF"."CONT_GUI_WS_PROPERTY" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index EMAIL_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."EMAIL_PK" ON "ITR_CONF"."EMAIL" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PROD_PROCESS_DEF_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."PROD_PROCESS_DEF_PK" ON "ITR_CONF"."PROD_PROCESS_DEF" ("CODE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PRODUCT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."PRODUCT_PK" ON "ITR_CONF"."PRODUCT" ("CODE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PROPERTY_MAP_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."PROPERTY_MAP_PK" ON "ITR_CONF"."PROPERTY_MAP" ("CODE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index RELEASE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."RELEASE_PK" ON "ITR_CONF"."RELEASE" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index TECHNICAL_WORK_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."TECHNICAL_WORK_PK" ON "ITR_CONF"."TECHNICAL_WORK" ("CODE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index WORKING_STATE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ITR_CONF"."WORKING_STATE_PK" ON "ITR_CONF"."WORKING_STATE" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table COMMON_CONFIG
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" ADD CONSTRAINT "COMMON_CONFIG_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" MODIFY ("FK_RELEASE" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" MODIFY ("FK_EMAIL" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" MODIFY ("FK_GUI" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" MODIFY ("FK_TW" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" MODIFY ("FK_PRODUCT" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" MODIFY ("FK_FLOW" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CONF_GUI_WS
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."CONF_GUI_WS" MODIFY ("ROLE" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."CONF_GUI_WS" ADD CONSTRAINT "CONF_GUI_WS_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."CONF_GUI_WS" MODIFY ("FK_WS" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."CONF_GUI_WS" MODIFY ("FK_CONT_GUI" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."CONF_GUI_WS" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CONT_GUI_VERSION
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION" MODIFY ("NAME" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION" ADD CONSTRAINT "CONT_GUI_VERSION_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION" MODIFY ("FK_RELEASE" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION" MODIFY ("FK_FLOW_CODE" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CONT_GUI_VERSION_CONF_GUI_WS
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION_CONF_GUI_WS" ADD CONSTRAINT "UK_91TEQDUERQ526TTFXMI2XLIV7" UNIQUE ("CONFGUIWSES_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION_CONF_GUI_WS" MODIFY ("CONFGUIWSES_ID" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION_CONF_GUI_WS" MODIFY ("CONT_GUI_VERSION_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CONT_GUI_WS_PROPERTY
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" ADD CHECK ( VALUE IN ('EDITABLE', 'MANDATORY', 'NONE', 'VISIBLE')) ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" ADD CHECK ( VALUE IN ('EDITABLE', 'MANDATORY', 'NONE', 'VISIBLE')) ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" ADD CHECK ( VALUE IN ('EDITABLE', 'MANDATORY', 'NONE', 'VISIBLE')) ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" ADD CHECK ( VALUE IN ('EDITABLE', 'MANDATORY', 'NONE', 'VISIBLE')) ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" ADD CHECK ( VALUE IN ('EDITABLE', 'MANDATORY', 'NONE', 'VISIBLE')) ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" ADD CONSTRAINT "CONT_GUI_WS_PROPERTY_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" MODIFY ("FK_PROPERTY" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" MODIFY ("FK_CONF_VERSION_WS" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table EMAIL
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."EMAIL" ADD CONSTRAINT "EMAIL_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."EMAIL" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PROD_PROCESS_DEF
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."PROD_PROCESS_DEF" ADD CONSTRAINT "PROD_PROCESS_DEF_PK" PRIMARY KEY ("CODE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."PROD_PROCESS_DEF" MODIFY ("FK_RELEASE" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."PROD_PROCESS_DEF" MODIFY ("CODE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PRODUCT
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."PRODUCT" ADD CONSTRAINT "PRODUCT_PK" PRIMARY KEY ("CODE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."PRODUCT" MODIFY ("FK_RELEASE" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."PRODUCT" MODIFY ("CODE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PROPERTY_MAP
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."PROPERTY_MAP" ADD CHECK ( TYPE IN ('ACTION', 'INPUT', 'LABEL', 'PANEL')) ENABLE;
  ALTER TABLE "ITR_CONF"."PROPERTY_MAP" ADD CHECK ( TYPE IN ('ACTION', 'INPUT', 'LABEL', 'PANEL')) ENABLE;
  ALTER TABLE "ITR_CONF"."PROPERTY_MAP" ADD CONSTRAINT "PROPERTY_MAP_PK" PRIMARY KEY ("CODE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."PROPERTY_MAP" MODIFY ("FK_RELEASE" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."PROPERTY_MAP" MODIFY ("CODE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table RELEASE
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."RELEASE" ADD CONSTRAINT "RELEASE_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."RELEASE" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TECHNICAL_WORK
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."TECHNICAL_WORK" ADD CONSTRAINT "TECHNICAL_WORK_PK" PRIMARY KEY ("CODE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."TECHNICAL_WORK" ADD CHECK ( TW_TYPE IN ('DISCONNECTED', 'STANDART', 'TEST')) ENABLE;
  ALTER TABLE "ITR_CONF"."TECHNICAL_WORK" MODIFY ("FK_RELEASE" NOT NULL ENABLE);
  ALTER TABLE "ITR_CONF"."TECHNICAL_WORK" MODIFY ("CODE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table WORKING_STATE
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."WORKING_STATE" ADD CONSTRAINT "WORKING_STATE_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "ITR_CONF"."WORKING_STATE" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table COMMON_CONFIG
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" ADD CONSTRAINT "COM_CONF_CONT_GUI_VERSION_FK" FOREIGN KEY ("FK_GUI")
	  REFERENCES "ITR_CONF"."CONT_GUI_VERSION" ("ID") ENABLE;
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" ADD CONSTRAINT "COM_CONF_EMAIL_FK" FOREIGN KEY ("FK_EMAIL")
	  REFERENCES "ITR_CONF"."EMAIL" ("ID") ENABLE;
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" ADD CONSTRAINT "COM_CONF_FLOW_FK" FOREIGN KEY ("FK_FLOW")
	  REFERENCES "ITR_CONF"."PROD_PROCESS_DEF" ("CODE") ENABLE;
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" ADD CONSTRAINT "COM_CONF_PRODUCT_FK" FOREIGN KEY ("FK_PRODUCT")
	  REFERENCES "ITR_CONF"."PRODUCT" ("CODE") ENABLE;
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" ADD CONSTRAINT "COM_CONF_RELEASE_FK" FOREIGN KEY ("FK_RELEASE")
	  REFERENCES "ITR_CONF"."RELEASE" ("ID") ENABLE;
  ALTER TABLE "ITR_CONF"."COMMON_CONFIG" ADD CONSTRAINT "COM_CONF_TECHNICAL_WORK_FK" FOREIGN KEY ("FK_TW")
	  REFERENCES "ITR_CONF"."TECHNICAL_WORK" ("CODE") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CONF_GUI_WS
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."CONF_GUI_WS" ADD CONSTRAINT "C_GUI_WS_C_GUI_VERSION_FK" FOREIGN KEY ("FK_CONT_GUI")
	  REFERENCES "ITR_CONF"."CONT_GUI_VERSION" ("ID") ENABLE;
  ALTER TABLE "ITR_CONF"."CONF_GUI_WS" ADD CONSTRAINT "C_GUI_WS_WORKING_STATE_FK" FOREIGN KEY ("FK_WS")
	  REFERENCES "ITR_CONF"."WORKING_STATE" ("ID") ENABLE;
  ALTER TABLE "ITR_CONF"."CONF_GUI_WS" ADD CONSTRAINT "FK_GF3P5DB5TTALEH2VRA8GECBV2" FOREIGN KEY ("FK_COUNT_GUI")
	  REFERENCES "ITR_CONF"."CONT_GUI_VERSION" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CONT_GUI_VERSION
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION" ADD CONSTRAINT "CONT_GUI_VERSION_FLOW_FK" FOREIGN KEY ("FK_FLOW_CODE")
	  REFERENCES "ITR_CONF"."PROD_PROCESS_DEF" ("CODE") ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION" ADD CONSTRAINT "CONT_GUI_VERSION_RELEASE_FK" FOREIGN KEY ("FK_RELEASE")
	  REFERENCES "ITR_CONF"."RELEASE" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CONT_GUI_VERSION_CONF_GUI_WS
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION_CONF_GUI_WS" ADD CONSTRAINT "FK_91TEQDUERQ526TTFXMI2XLIV7" FOREIGN KEY ("CONFGUIWSES_ID")
	  REFERENCES "ITR_CONF"."CONF_GUI_WS" ("ID") ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_VERSION_CONF_GUI_WS" ADD CONSTRAINT "FK_IGK74609GV9GEL5QLSXJ0N04E" FOREIGN KEY ("CONT_GUI_VERSION_ID")
	  REFERENCES "ITR_CONF"."CONT_GUI_VERSION" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CONT_GUI_WS_PROPERTY
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" ADD CONSTRAINT "C_GUI_WS_PROP_C_GUI_WS_FK" FOREIGN KEY ("FK_CONF_VERSION_WS")
	  REFERENCES "ITR_CONF"."CONF_GUI_WS" ("ID") ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" ADD CONSTRAINT "C_GUI_WS_PROP_PROP_MAP_FK" FOREIGN KEY ("FK_PROPERTY")
	  REFERENCES "ITR_CONF"."PROPERTY_MAP" ("CODE") ENABLE;
  ALTER TABLE "ITR_CONF"."CONT_GUI_WS_PROPERTY" ADD CONSTRAINT "FK_KQLEGYUVNWQY3PA9I2H4GKQVR" FOREIGN KEY ("FK_CONF_VERSION")
	  REFERENCES "ITR_CONF"."CONF_GUI_WS" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PROD_PROCESS_DEF
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."PROD_PROCESS_DEF" ADD CONSTRAINT "FLOW_RELEASE_FK" FOREIGN KEY ("FK_RELEASE")
	  REFERENCES "ITR_CONF"."RELEASE" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PRODUCT
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."PRODUCT" ADD CONSTRAINT "PRODUCT_RELEASE_FK" FOREIGN KEY ("FK_RELEASE")
	  REFERENCES "ITR_CONF"."RELEASE" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PROPERTY_MAP
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."PROPERTY_MAP" ADD CONSTRAINT "PROPERTY_MAP_RELEASE_FK" FOREIGN KEY ("FK_RELEASE")
	  REFERENCES "ITR_CONF"."RELEASE" ("ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TECHNICAL_WORK
--------------------------------------------------------

  ALTER TABLE "ITR_CONF"."TECHNICAL_WORK" ADD CONSTRAINT "TECHNICAL_WORK_RELEASE_FK" FOREIGN KEY ("FK_RELEASE")
	  REFERENCES "ITR_CONF"."RELEASE" ("ID") ENABLE;
--------------------------------------------------------
--  DDL for Trigger COMMON_CONFIG_ID_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "ITR_CONF"."COMMON_CONFIG_ID_TRG" BEFORE
INSERT ON COMMON_CONFIG FOR EACH ROW  WHEN (NEW.ID IS NULL) BEGIN :NEW.ID := COMMON_CONFIG_ID_SEQ.NEXTVAL;
END;
/
ALTER TRIGGER "ITR_CONF"."COMMON_CONFIG_ID_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger CONF_GUI_WS_ID_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "ITR_CONF"."CONF_GUI_WS_ID_TRG" BEFORE
  INSERT ON CONF_GUI_WS FOR EACH ROW  WHEN (NEW.ID IS NULL) BEGIN :NEW.ID := CONF_GUI_WS_ID_SEQ.NEXTVAL;
END;
/
ALTER TRIGGER "ITR_CONF"."CONF_GUI_WS_ID_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger CONT_GUI_VERSION_ID_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "ITR_CONF"."CONT_GUI_VERSION_ID_TRG" BEFORE
  INSERT ON CONT_GUI_VERSION FOR EACH ROW  WHEN (NEW.ID IS NULL) BEGIN :NEW.ID := CONT_GUI_VERSION_ID_SEQ.NEXTVAL;
END;
/
ALTER TRIGGER "ITR_CONF"."CONT_GUI_VERSION_ID_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger CONT_GUI_WS_PROPERTY_ID_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "ITR_CONF"."CONT_GUI_WS_PROPERTY_ID_TRG" BEFORE
  INSERT ON CONT_GUI_WS_PROPERTY FOR EACH ROW  WHEN (NEW.ID IS NULL) BEGIN :NEW.ID := CONT_GUI_WS_PROPERTY_ID_SEQ.NEXTVAL;
END;
/
ALTER TRIGGER "ITR_CONF"."CONT_GUI_WS_PROPERTY_ID_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger EMAIL_ID_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "ITR_CONF"."EMAIL_ID_TRG" BEFORE
INSERT ON EMAIL FOR EACH ROW  WHEN (NEW.ID IS NULL) BEGIN :NEW.ID := EMAIL_ID_SEQ.NEXTVAL;
END;
/
ALTER TRIGGER "ITR_CONF"."EMAIL_ID_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger RELEASE_ID_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "ITR_CONF"."RELEASE_ID_TRG" BEFORE
  INSERT ON RELEASE FOR EACH ROW  WHEN (NEW.ID IS NULL) BEGIN :NEW.ID := RELEASE_ID_SEQ.NEXTVAL;
END;
/
ALTER TRIGGER "ITR_CONF"."RELEASE_ID_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger WORKING_STATE_ID_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "ITR_CONF"."WORKING_STATE_ID_TRG" BEFORE
  INSERT ON WORKING_STATE FOR EACH ROW  WHEN (NEW.ID IS NULL) BEGIN :NEW.ID := WORKING_STATE_ID_SEQ.NEXTVAL;
END;
/
ALTER TRIGGER "ITR_CONF"."WORKING_STATE_ID_TRG" ENABLE;
