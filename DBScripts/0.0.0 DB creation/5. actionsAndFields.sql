ALTER TABLE CONT_GUI_WS_PROPERTY ADD VALUE VARCHAR2 (10);
ALTER TABLE CONT_GUI_WS_PROPERTY ADD CHECK ( VALUE IN ('EDITABLE', 'MANDATORY', 'NONE', 'VISIBLE')) ;
ALTER TABLE CONF_GUI_WS  ADD  ROLE     VARCHAR2 (255) NOT NULL;
ALTER TABLE CONT_GUI_VERSION ADD NAME  VARCHAR2 (255);