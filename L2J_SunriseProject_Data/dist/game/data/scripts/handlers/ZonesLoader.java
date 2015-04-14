/*
 * Copyright (C) 2004-2015 L2J DataPack
 * 
 * This file is part of L2J DataPack.
 * 
 * L2J DataPack is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * L2J DataPack is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ai.zone.DragonValley.DragonValley;
import ai.zone.DragonValley.NecromancerValley;
import ai.zone.FantasyIsle.HandysBlockCheckerEvent;
import ai.zone.FantasyIsle.MC_Show;
import ai.zone.FantasyIsle.Parade;
import ai.zone.LairOfAntharas.LairOfAntharas;
import ai.zone.PavelRuins.PavelArchaic;
import ai.zone.PrimevalIsle.PrimevalIsle;
import ai.zone.SelMahums.SelMahumDrill;
import ai.zone.SelMahums.SelMahumSquad;
import ai.zone.StakatoNest.CannibalisticStakatoChief;
import ai.zone.StakatoNest.CannibalisticStakatoFollower;
import ai.zone.StakatoNest.FemaleSpikedStakato;
import ai.zone.StakatoNest.MaleSpikedStakato;
import ai.zone.StakatoNest.SpikedStakatoBaby;
import ai.zone.StakatoNest.SpikedStakatoNurse;
import ai.zone.StakatoNest.StakatoNest;

/**
 * @author L2jSunrise Team
 * @Website www.l2jsunrise.com
 */
public final class ZonesLoader
{
	private static final Logger _log = LoggerFactory.getLogger(ZonesLoader.class);
	
	private static final Class<?>[] ZONES =
	{
		DragonValley.class,
		NecromancerValley.class,
		HandysBlockCheckerEvent.class,
		MC_Show.class,
		Parade.class,
		LairOfAntharas.class,
		PavelArchaic.class,
		PrimevalIsle.class,
		SelMahumDrill.class,
		SelMahumSquad.class,
		CannibalisticStakatoChief.class,
		CannibalisticStakatoFollower.class,
		FemaleSpikedStakato.class,
		MaleSpikedStakato.class,
		SpikedStakatoBaby.class,
		SpikedStakatoNurse.class,
		StakatoNest.class,
	};
	
	public static void main(String[] args)
	{
		_log.info(ZonesLoader.class.getSimpleName() + ": Loading related scripts.");
		for (Class<?> script : ZONES)
		{
			try
			{
				script.newInstance();
			}
			catch (Exception e)
			{
				_log.error(ZonesLoader.class.getSimpleName() + ": Failed loading " + script.getSimpleName() + ":", e);
			}
		}
	}
}