/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_putstr_non_printable.c                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: jre-gonz <jre-gonz@student.42madrid.com>   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/01/18 11:17:15 by jre-gonz          #+#    #+#             */
/*   Updated: 2022/01/18 11:19:16 by jre-gonz         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <unistd.h>
#include <stdio.h>

#define FIRST_PRINTABLE 32
#define LAST_PRINTABLE 126

int	is_printable(char c)
{
	return (c >= FIRST_PRINTABLE && c <= LAST_PRINTABLE);
}

void	ft_print_hex(int c, int err)
{
	char	*model;

	model = "0123456789abcdef";
	if (c <= 0 && err == 0)
		c += 256;
	if (c >= 16)
	{
		ft_print_hex(c / 16, 1);
		ft_print_hex(c % 16, 1);
	}
	else
	{
		if (err == 0)
			write(1, "0", 1);
		write(1, &model[c], 1);
	}
}

void	ft_putstr_non_printable(char *str)
{
	int	i;

	i = 0;
	while (str[i])
	{
		if (!is_printable(str[i]))
		{
			write(1, "\\", 1);
			ft_print_hex((unsigned int) str[i], 0);
		}
		else
			write(1, &str[i], 1);
		i++;
	}
}
