CREATE TABLE Contact
(
    ID           int(10) unsigned                 NOT NULL AUTO_INCREMENT,
    PHONE        varchar(128) CHARACTER SET ascii NOT NULL,
    NAME         varchar(128) CHARACTER SET ascii NOT NULL,
    EMAIL        varchar(128) CHARACTER SET ascii,
    ORGANIZATION varchar(255) CHARACTER SET ascii,
    PRIMARY KEY (ID)
);