----- Borrador de procedimientos
-----

CREATE OR REPLACE 
PACKAGE PKG_CLIENTE AS 
PROCEDURE SP_LOGIN_CLIENT(param_rut varchar2, param_passwd varchar2, out SYS_REFCURSOR);
PROCEDURE SP_CHECK_USER(param_rut);
PROCEDURE SP_CREATE_CLIENT(param_rut varchar2,param_comuna int, param_nombre varchar2, param_paterno varchar2, param_materno varchar2, param_direccion varchar2, param_telefono varchar2,  param_passwd varchar2);
PROCEDURE SP_UPDATE_CLIENT(param_rut varchar2,param_comuna int, param_nombre varchar2, param_paterno varchar2, param_materno varchar2, param_direccion varchar2, param_telefono varchar2,  param_passwd varchar2);


END PKG_CLIENTE;
---
CREATE OR REPLACE
PACKAGE BODY AS PKG_CLIENTE

-- SP_CREATE_CLIENT --
PROCEDURE SP_CREATE_CLIENT(param_rut varchar2,param_comuna int, param_nombre varchar2, param_paterno varchar2, param_materno varchar2, param_direccion varchar2, param_telefono varchar2,  param_passwd varchar2)
IS
BEGIN
INSERT INTO CLIENT(rut, comuna, nombre, appaterno, apmaterno, direccion, telefono, passwd)
VALUES(param_rut, param_comuna, param_nombre, param_paterno, param_materno, param_direccion, param_passwd)
COMMIT;
-- DEBERIA DEVOLVER EL ESTATUS ?
END;
-- END SP_CREATE_CLIENT --

-- SP_UPDATE_CLIENT --
PROCEDURE SP_UPDATE_CLIENT(param_rut varchar2,param_comuna int, param_nombre varchar2, param_paterno varchar2, param_materno varchar2, param_direccion varchar2, param_telefono varchar2,  param_passwd varchar2)
IS
BEGIN
UPDATE CLIENT 
SET comuna=param_comuna, nombre=param_nombre, paterno=param_paterno, materno=patam_materno, direccion=param_direccion, telefono=param_telefono, passwd=param_passwd
WHERE rut = param_rut
COMMIT;
END;

-- SP_LOGIN_CLIENT --
PROCEDURE SP_LOGIN_CLIENT(param_rut varchar2, param_passwd varchar2)
IS
BEGIN
SELECT * FROM CLIENTE WHERE RUT=param_rut AND passwd=param_passwd and rownum = 1;
END;
-- END SP_UPDATE_CLIENT --


-- SP_CHECK_USER BEFORE INSERT CHECK IF RUT IS ACTUALLY IN USE-- 
PROCEDURE SP_CHECK_USER(param_rut)
IS
BEGIN
SELECT * FROM CLIENTE WHERE RUT=param_rut;
END;
-- END SP_CHECK_USER --
END PKG_CLIENTE;



