CREATE TABLE `branches` (
	`branchId` INT(11) NOT NULL,
	`branchName` VARCHAR(50) NULL DEFAULT NULL,
	`branchAddress` VARCHAR(100) NULL DEFAULT NULL,
	PRIMARY KEY (`branchId`)
);

CREATE TABLE `vaccines` (
	`vaccineId` INT(11) NOT NULL,
	`vaccineName` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`vaccineId`)
);

CREATE TABLE `branch_vaccine` (
	`branchId` INT(11) NOT NULL,
	`vaccineId` INT(11) NULL DEFAULT NULL
);

CREATE TABLE `branch_timeslots` (
	`slotId` INT(11) NOT NULL,
	`branchId` INT(11) NULL DEFAULT NULL,
	`timeSlot` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`slotId`)
);

CREATE TABLE `vaccination` (
    `appliedId` INT(11) IDENTITY(1,1) NOT NULL,
    `branchId` INT(11) NOT NULL,
    `vaccineId` INT(11) NOT NULL,
    `timeSlot` VARCHAR(50) NULL DEFAULT NULL,
    `userId` INT(11) NOT NULL,
    `isConfirmed` NUMBER(1) NOT NULL,
    `appliedTime` DATE NOT NULL,
     PRIMARY KEY (`appliedId`)
);