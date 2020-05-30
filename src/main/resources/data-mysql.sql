INSERT INTO user (id,username,password)
VALUES (1,'jin@coder.com','$2a$10$0733N9ZufQvuEOjCVY8Xh.tEbaHVym6i/ipIRfsrpCvWX7x67Qa4q');

INSERT INTO authorities (id,authority,user_id)
VALUES (1,'ROLE_USER','1');
INSERT INTO authorities (id,authority,user_id)
VALUES (2,'ROLE_ADMIN','1');