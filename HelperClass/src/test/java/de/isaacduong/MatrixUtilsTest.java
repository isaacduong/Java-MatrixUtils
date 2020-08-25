package de.isaacduong;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MatrixUtilsTest
{

	int[][] A = { { 1, 1 }, { 1, 1 } };
	int[][] B = { { 2, 3 }, { 4, 5 } };
	int[][] C = { { 2, 2 } };
	int[][] D = { { 2, 2 }, { 2, 2 } };

	@Test
	void matrixAddTrueTest() throws Exception
	{

		assertArrayEquals(new int[][] { { 3, 4 }, { 5, 6 } }, MatrixUtils.matrixAdd(this.A, this.B));

	}

	@Test
	void matrixAddFalseTest() throws Exception
	{

		assertNotEquals(new int[][] { { 1, 1 }, { 1, 1 } }, MatrixUtils.matrixAdd(this.A, this.D));

	}

	@Test
	void matrixAddExpectedExeptionTest()
	{

		Assertions.assertThrows(Exception.class, () -> MatrixUtils.matrixAdd(this.A, this.C));
	}

	@Test
	void matrixTransposeTest() throws Exception
	{

		assertArrayEquals(new int[][] { { 2, 4 }, { 3, 5 } }, MatrixUtils.matrixTranspose(this.B));

	}

	@Test
	void matrixTransposeExpectedExceptionTest()
	{

		Assertions.assertThrows(Exception.class, () -> MatrixUtils.matrixTranspose(this.C));
	}

	@Test
	void matrixMul() throws Exception
	{

		assertArrayEquals(new int[][] { { 4, 4 }, { 4, 4 } }, MatrixUtils.matrixMul(this.A, this.D));
	}

}
