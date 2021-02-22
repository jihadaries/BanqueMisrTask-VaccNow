INSERT INTO `branches` (`branchId`, `branchName`, `branchAddress`) VALUES (101, 'Maadi', 'Cairo-Egypt');
INSERT INTO `branches` (`branchId`, `branchName`, `branchAddress`) VALUES (102, 'Smart Village', '6th of October city-Giza-Egypt');
INSERT INTO `branches` (`branchId`, `branchName`, `branchAddress`) VALUES (103, 'Down Town', '26 july street-Cairo-Egypt');


INSERT INTO `vaccines` (`vaccineId`, `VaccineName`) VALUES (1, 'Pfizer');
INSERT INTO `vaccines` (`vaccineId`, `VaccineName`) VALUES (2, 'Moderna');
INSERT INTO `vaccines` (`vaccineId`, `VaccineName`) VALUES (3, 'AstraZeneca');

INSERT INTO `branch_vaccine` (`branchId`, `vaccineId`) VALUES (101, 1);
INSERT INTO `branch_vaccine` (`branchId`, `vaccineId`) VALUES (102, 1);
INSERT INTO `branch_vaccine` (`branchId`, `vaccineId`) VALUES (103, 1);
INSERT INTO `branch_vaccine` (`branchId`, `vaccineId`) VALUES (101, 2);
INSERT INTO `branch_vaccine` (`branchId`, `vaccineId`) VALUES (102, 2);
INSERT INTO `branch_vaccine` (`branchId`, `vaccineId`) VALUES (101, 3);
INSERT INTO `branch_vaccine` (`branchId`, `vaccineId`) VALUES (103, 3);

INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (1, 101, '09:00AM-09:15AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (2, 101, '09:15AM-09:30AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (3, 101, '09:30AM-09:45AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (4, 101, '09:45AM-10:00AM');

INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (5, 101, '10:00AM-10:15AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (6, 101, '10:15AM-10:30AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (7, 101, '10:30AM-10:45AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (8, 101, '10:45AM-11:00AM');

INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (9, 101, '11:00AM-11:15AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (10, 101, '11:15AM-11:30AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (11, 101, '11:30AM-11:45AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (12, 101, '11:45AM-12:00PM');

INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (13, 102, '10:00AM-10:15AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (14, 102, '10:15AM-10:30AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (15, 102, '10:30AM-10:45AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (16, 102, '10:45AM-11:00AM');

INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (17, 102, '11:00AM-11:15AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (18, 102, '11:15AM-11:30AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (19, 102, '11:30AM-11:45AM');
INSERT INTO `branch_timeslots` (`slotId`, `branchId`, `timeSlot`) VALUES (20, 102, '11:45AM-12:00PM');

INSERT INTO `vaccination` (`branchId`,`vaccineId`, `timeSlot`, `userId`, `isConfirmed`, `appliedTime`) VALUES (101, 1, '10:00AM-10:15AM', '001', true, sysdate-2);
INSERT INTO `vaccination` (`branchId`,`vaccineId`, `timeSlot`, `userId`, `isConfirmed`,`appliedTime`) VALUES (101, 1, '11:15AM-11:30AM', '002', false, sysdate);