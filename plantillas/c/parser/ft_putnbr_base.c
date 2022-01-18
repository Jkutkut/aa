/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_putnbr_base.c                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: jre-gonz <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/12/07 21:33:55 by jre-gonz          #+#    #+#             */
/*   Updated: 2021/12/08 15:26:14 by jre-gonz         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */
#include <unistd.h>
#define MIN_BASE 2

int	get_base(char *base)
{
	int		i;
	char	*current;

	i = 0;
	if (!base[0])
		return (0);
	while (base[i])
	{
		current = &base[i];
		if (*current == '+' || *current == '-')
			return (0);
		current++;
		while (*current)
		{
			if (base[i] == *current)
				return (0);
			current++;
		}
		i++;
	}
	return (i);
}

void	print_in_base(int nbr, char *base, int b)
{
	int	n;
	int	next;

	next = nbr / b;
	if (next < 0)
		next *= -1;
	if (next > 0)
		print_in_base(next, base, b);
	n = nbr % b;
	if (n < 0)
		n *= -1;
	write (1, &base[n], 1);
}

void	ft_putnbr_base(int nbr, char *base)
{
	int	b;

	b = get_base(base);
	if (b < MIN_BASE)
		return ;
	if (nbr < 0)
	{
		write(1, "-", 1);
	}
	print_in_base(nbr, base, b);
}
