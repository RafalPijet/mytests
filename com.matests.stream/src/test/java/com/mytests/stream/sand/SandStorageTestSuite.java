package com.mytests.stream.sand;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {
    @Test
    public void testGetSandBeansQuantity() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Africa());
        continents.add(new Asia());

        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        BigDecimal testSand = new BigDecimal("211111110903703703670");
        for (SandStorage continent : continents) {
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }

        //Then
        Assert.assertEquals(testSand, totalSand);

    }

    @Test
    public void testGetSandBeansQuantityWithReduce() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Africa());
        continents.add(new Asia());
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");

        //When
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        Assert.assertEquals(expectedSand, totalSand);
    }
}
